package com.ebazaar.dao;

import java.util.List;

import com.ebazaar.databaseobject.dto.Category;
import com.ebazaar.transferobject.dto.CategoryDTO;
import com.ebazaar.transferobject.dto.ProductCatergoryDTO;

public interface HomePageDAO {
	public List<CategoryDTO> listAllCategory();
}
