package com.ebazaar.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ebazaar.dao.HomePageDAO;
import com.ebazaar.databaseobject.dto.Category;
import com.ebazaar.databaseobject.dto.Product;
import com.ebazaar.databaseobject.dto.SubCategory;
import com.ebazaar.databaseobject.query.HibernateQueryUtil;
import com.ebazaar.databaseobject.query.QueryUtil;
import com.ebazaar.transferobject.dto.CategoryDTO;
import com.ebazaar.transferobject.dto.ProductCatergoryDTO;
import com.ebazaar.transferobject.dto.ProductDTO;
import com.ebazaar.transferobject.dto.SubCategoryDTO;
public class HomePageDAOImpl extends HibernateDaoSupport implements HomePageDAO{
	private QueryUtil queryUtil;
	
	public void setQueryUtil(QueryUtil queryUtil) {
		this.queryUtil = queryUtil;
	}

	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CategoryDTO> listAllCategory() {
		List<CategoryDTO> categories = new ArrayList<CategoryDTO>();
		Session session = getSession();

		Query query = session.createQuery(queryUtil.getListCategory());
		List<Category> databaseCategories =  query.list();
		if (databaseCategories != null) {
			for (Category category : databaseCategories) {
				CategoryDTO categoryDTO = new CategoryDTO();
				categoryDTO.setCategoryId(category.getCategoryId());
				categoryDTO.setAttribute(category.getAttribute());
				if (category.getSubCategories() != null) {
					categoryDTO.setSubCategoryCount(category.getSubCategories().size());
					List<SubCategoryDTO> subCategoryDTOs = new ArrayList<SubCategoryDTO>();
					for (SubCategory subCategory : category.getSubCategories()) {
						SubCategoryDTO subCategoryDTO = new SubCategoryDTO();
						subCategoryDTOs.add(subCategoryDTO);
						subCategoryDTO.setAttribute(subCategory.getAttribute());
						subCategoryDTO.setSubCategoryId(subCategory.getSubCategoryId());
						if(subCategory.getProducts() != null) {
							List<ProductDTO> productDTOs = new ArrayList<ProductDTO>();
							for(Product product : subCategory.getProducts()) {
								ProductDTO productDTO = new ProductDTO();
								productDTO.setAttribute(product.getAttribute());
								productDTO.setProductId(product.getProductId());
//								productDTO.setProductCategory(product.getProductCategory());
								productDTOs.add(productDTO);
							}
							subCategoryDTO.setProducts(productDTOs);
						}
					}
					
					categoryDTO.setSubCategoryDTOs(subCategoryDTOs);
				}
				categories.add(categoryDTO);
				System.out.println("categoryDTOList size :"+categories.size());
			}
		}
		session.close();
		return categories;
	}


	
}
