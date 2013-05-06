package com.ebazaar.service.impl;

import java.util.List;

import com.ebazaar.dao.ProductListingPageDAO;
import com.ebazaar.service.ProductListingPageService;
import com.ebazaar.transferobject.dto.ItemDTO;

public class ProductListingPageServiceImpl implements ProductListingPageService {
	private ProductListingPageDAO productListingPageDAO;

	public void setProductListingPageDAO(ProductListingPageDAO productListingPageDAO) {
		this.productListingPageDAO = productListingPageDAO;
	}
	@Override
	public List<ItemDTO> getAllItems(String product_id) {
		List<ItemDTO> itemDTOList = productListingPageDAO.listAllItem(product_id);		
		System.out.println("ItemDTO size :"+itemDTOList.size());
		return itemDTOList;
	}

	
}
