package com.ebazaar.controller;

//import java.util.Calendar;
//import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.ebazaar.service.HomePageService;
import com.ebazaar.service.ItemDetailPageService;
import com.ebazaar.transferobject.dto.ItemDTO;


public class ItemDetailPageController extends AbstractController {
	private ItemDetailPageService itemDetailPageService;
	
	public void setItemDetailPageService(ItemDetailPageService itemDetailPageService) {
		this.itemDetailPageService = itemDetailPageService;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		//System.out.println("Here 1");
		// time at the server

	//	Date today = Calendar.getInstance().getTime();
		String itemId = request.getParameter("item_id");
		ModelAndView mv = null;
		if(itemId != null && itemId.length() > 0) {
			 ItemDTO itemDTO = itemDetailPageService.getItem(new Long(itemId));
			 if(itemDTO != null) {
				 
				 
				 new ModelAndView("itemDetailPage"+itemDTO.getPageLocator());
			 } else{
				 new ModelAndView("itemDetailPage/jsp/itemDetailDefaultPage.jsp");
			 }
		} 
		return mv;
	}
	
}