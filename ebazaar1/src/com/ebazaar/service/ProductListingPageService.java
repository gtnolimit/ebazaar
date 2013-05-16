package com.ebazaar.service;

import java.util.List;

import com.ebazaar.transferobject.dto.ItemDTO;
import com.ebazaar.transferobject.dto.PaginationDTO;

public interface ProductListingPageService {
	public List<ItemDTO> getAllItems(String product_id);

	public PaginationDTO getPaginatedResults(PaginationDTO paginationDTO);

}
