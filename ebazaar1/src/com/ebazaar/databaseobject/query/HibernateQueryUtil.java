package com.ebazaar.databaseobject.query;

public class HibernateQueryUtil implements QueryUtil{
	public String getListCategory() {
		return "from com.ebazaar.databaseobject.dto.Category c";
	}

	public String getListItems() {
		return "from com.ebazaar.databaseobject.dto.Item i where i.product_id = :product_id";
	}

	
}
