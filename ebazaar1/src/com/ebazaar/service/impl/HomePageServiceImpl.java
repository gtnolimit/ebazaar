package com.ebazaar.service.impl;

import java.util.List;

import com.ebazaar.dao.HomePageDAO;
import com.ebazaar.service.HomePageService;
import com.ebazaar.transferobject.dto.CategoryDTO;



public class HomePageServiceImpl implements HomePageService {
	private HomePageDAO homePageDAO;

	public void setHomePageDAO(HomePageDAO homePageDAO) {
		this.homePageDAO = homePageDAO;
	}
	public List<CategoryDTO> getAllCategories() {
		List<CategoryDTO> categoryDTOList = homePageDAO.listAllCategory();
		
//		Category category1=new Category();
//		category1.getSubCategories();
//		System.out.println(category1.getSubCategories().size());
		System.out.println("categoryDTOList size :"+categoryDTOList.size());
		return categoryDTOList;
	}


}