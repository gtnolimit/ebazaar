package com.ebazaar.dao;

import java.util.List;

import com.ebazaar.transferobject.dto.ItemDTO;
import com.ebazaar.transferobject.dto.PaginationDTO;

public interface ProductListingPageDAO {
	public List<ItemDTO> listAllItem(String product_id);

	public PaginationDTO getPaginatedResults(PaginationDTO paginationDTO);
}
