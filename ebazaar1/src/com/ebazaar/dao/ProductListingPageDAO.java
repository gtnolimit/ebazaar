package com.ebazaar.dao;

import java.util.List;

import com.ebazaar.transferobject.dto.ItemDTO;

public interface ProductListingPageDAO {
	public List<ItemDTO> listAllItem(String product_id);
}
