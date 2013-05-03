package com.ebazaar.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ebazaar.dao.HomePageDAO;
import com.ebazaar.databaseobject.dto.Category;


public class HomePageDAOImpl extends HibernateDaoSupport implements HomePageDAO{
	@SuppressWarnings("unchecked")
	public List<Category> listAllCategory() {
		return getHibernateTemplate().find("from com.ebazaar.databaseobject.dto.Category c");
	}

	
}
