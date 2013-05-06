package com.ebazaar.service;

import java.util.List;

import com.ebazaar.transferobject.dto.CategoryDTO;
import com.ebazaar.transferobject.dto.ProductCatergoryDTO;


public interface HomePageService {
	public List<CategoryDTO> getAllCategories();
}
