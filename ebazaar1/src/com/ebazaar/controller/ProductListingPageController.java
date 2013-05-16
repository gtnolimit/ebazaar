package com.ebazaar.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.ebazaar.enumDef.ProductSortEnum;
import com.ebazaar.service.ProductListingPageService;
import com.ebazaar.transferobject.dto.ManufactureDTO;
import com.ebazaar.transferobject.dto.PaginationDTO;
import com.ebazaar.util.EBazaarConstants;

public class ProductListingPageController extends AbstractController {
	private ProductListingPageService productListingPageService;
	public void setProductListingPageService(ProductListingPageService productListingPageService) {
		this.productListingPageService = productListingPageService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
//		String product_id=request.getParameter("product_id");
		
		String productRefreshStatus = request.getParameter("productViewDisplayed");
		if(productRefreshStatus == null || !productRefreshStatus.equalsIgnoreCase("productRefreshStatus")) {
			productRefreshStatus = "itemListing";
		}
		Long productId = 0L;
		if(request.getParameter("product_id") == null || request.getParameter("product_id").length() < 1) {
			ModelAndView mv = new ModelAndView(productRefreshStatus);
			PaginationDTO paginationDTO = new PaginationDTO();
			
			
			paginationDTO.setItems(new ArrayList<ManufactureDTO>());
			mv.addObject("paginatedResults", paginationDTO);
			return mv;
		} else {
			try {
				productId = Long.parseLong(request.getParameter("product_id"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(productId < 1) {
			ModelAndView mv = new ModelAndView(productRefreshStatus);
			PaginationDTO paginationDTO = new PaginationDTO();
			
			
			paginationDTO.setItems(new ArrayList<ManufactureDTO>());
			mv.addObject("paginatedResults", paginationDTO);
		}
		int pageNumber = 1;
		int pageSize = EBazaarConstants.defaultPageSize;
		if(request.getParameter("pageNumber") != null && request.getParameter("pageNumber").length() > 0) {
			try {
				pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(pageNumber < 1) {
			pageNumber = 1;
		}
		
		
		if(request.getParameter("pageSize") != null && request.getParameter("pageSize").length() > 0) {
			try {
				pageSize = Integer.parseInt(request.getParameter("pageSize"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(pageSize < 1) {
			pageSize = EBazaarConstants.defaultPageSize;
		}
			//System.out.println("ProductListingPageController product_id::"+product_id);
		ModelAndView mv = new ModelAndView(productRefreshStatus);
		PaginationDTO paginationDTO = new PaginationDTO();
		paginationDTO.setPageNumber(pageNumber);
		paginationDTO.setPageSize(pageSize);
		paginationDTO.setProductId(productId);
		if(productRefreshStatus == null || !productRefreshStatus.equalsIgnoreCase("productRefreshStatus")) {
			paginationDTO.setProductSort(ProductSortEnum.Manufacturer.getProductSortValue());
			
		} else {
			paginationDTO.setProductSort(request.getParameter("order_by"));
		}
		paginationDTO.setProductListSize(pageSize+"");
		mv.addObject("paginatedResults", productListingPageService.getPaginatedResults(paginationDTO));
		return mv;
	}
}