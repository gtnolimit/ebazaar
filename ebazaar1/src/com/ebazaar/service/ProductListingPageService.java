package com.ebazaar.service;

import java.util.List;

import com.ebazaar.transferobject.dto.ItemDTO;

public interface ProductListingPageService {
	public List<ItemDTO> getAllItems(String product_id);

}
