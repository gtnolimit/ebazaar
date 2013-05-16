package com.ebazaar.service.impl;

import com.ebazaar.dao.ItemDetailDAO;
import com.ebazaar.service.ItemDetailPageService;
import com.ebazaar.transferobject.dto.ItemDTO;


public class ItemDetailPageServiceImpl implements ItemDetailPageService {
	private ItemDetailDAO itemDetailDAO;
	public void setItemDetailDAO(ItemDetailDAO itemDetailDAO) {
		this.itemDetailDAO = itemDetailDAO;
	}

	
	public ItemDTO getItem(Long itemId) {
		ItemDTO itemDTO = itemDetailDAO.getItem(itemId);
		
		return itemDTO;
	}


}