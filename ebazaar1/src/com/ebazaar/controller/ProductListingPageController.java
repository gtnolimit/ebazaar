package com.ebazaar.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import com.ebazaar.service.ProductListingPageService;

public class ProductListingPageController extends AbstractController {
	private ProductListingPageService productListingPageService;
	public void setProductListingPageService(ProductListingPageService productListingPageService) {
		this.productListingPageService = productListingPageService;
	}

	@Override

	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		String product_id=request.getParameter("product_id");
			//System.out.println("ProductListingPageController product_id::"+product_id);
		ModelAndView mv = new ModelAndView("itemListing");
		mv.addObject("items", productListingPageService.getAllItems(product_id));
		return mv;
	}
}