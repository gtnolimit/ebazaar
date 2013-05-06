package com.ebazaar.controller;

//import java.util.Calendar;
//import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.ebazaar.service.HomePageService;


public class HomePageController extends AbstractController {
	private HomePageService homePageService;
	public void setHomePageService(HomePageService homePageService) {
		this.homePageService = homePageService;
	}

	@Override

	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		//System.out.println("Here 1");
		// time at the server

	//	Date today = Calendar.getInstance().getTime();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("categorys", homePageService.getAllCategories());
		WebApplicationContext webApplicationContext = getWebApplicationContext();
		webApplicationContext.getServletContext().setAttribute("categorys", homePageService.getAllCategories());

		return mv;
	}
}