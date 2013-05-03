package com.ebazaar.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ebazaar.dao.HomePageDAO;
import com.ebazaar.databaseobject.dto.Category;
import com.ebazaar.databaseobject.dto.SubCategory;
import com.ebazaar.service.HomePageService;
import com.ebazaar.transferobject.dto.CategoryDTO;
import com.ebazaar.transferobject.dto.SubCategoryDTO;



public class HomePageServiceImpl implements HomePageService {
	private HomePageDAO homePageDAO;

	public void setHomePageDAO(HomePageDAO homePageDAO) {
		this.homePageDAO = homePageDAO;
	}

	public List<CategoryDTO> getAllCategories() {
		List<CategoryDTO> categoryDTOList = new ArrayList<CategoryDTO>();
		List<Category> categorys = homePageDAO.listAllCategory();
		System.out.println("categorys size :"+categorys.size());
		if (categorys != null) {
			for (Category category : categorys) {
				CategoryDTO categoryDTO = new CategoryDTO();
				categoryDTO.setCategoryId(category.getCategoryId());
				categoryDTO.setAttribute(category.getAttribute());
				categoryDTO.setCpd(category.getCpd());
				categoryDTO.setUpd(category.getUpd());
				if (category.getSubCategories() != null) {
					List<SubCategoryDTO> subCategoryDTOs = new ArrayList<SubCategoryDTO>();
					for (SubCategory subCategory : category.getSubCategories()) {
						SubCategoryDTO subCategoryDTO = new SubCategoryDTO();
						subCategoryDTOs.add(subCategoryDTO);
						subCategoryDTO.setAttribute(subCategory.getAttribute());
						subCategoryDTO.setSubCategoryId(subCategory.getSubCategoryId());
						subCategoryDTO.setCpd(subCategory.getCpd());
						subCategoryDTO.setUpd(subCategory.getUpd());
						subCategoryDTOs.add(subCategoryDTO);
					}
					categoryDTO.setSubCategoryDTOs(subCategoryDTOs);
				}
				categoryDTOList.add(categoryDTO);
				System.out.println("categoryDTOList size :"+categoryDTOList.size());
			}
		}

		return categoryDTOList;
	}
}
