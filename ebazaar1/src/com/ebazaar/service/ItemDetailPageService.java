package com.ebazaar.service;

import com.ebazaar.transferobject.dto.ItemDTO;


public interface ItemDetailPageService {
	
	public ItemDTO getItem(Long itemId);
}
