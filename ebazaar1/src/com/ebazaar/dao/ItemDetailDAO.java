package com.ebazaar.dao;

import com.ebazaar.transferobject.dto.ItemDTO;

public interface ItemDetailDAO {

	public ItemDTO getItem(Long itemId);

}
