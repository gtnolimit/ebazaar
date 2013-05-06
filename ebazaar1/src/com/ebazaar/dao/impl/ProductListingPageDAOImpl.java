package com.ebazaar.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.ebazaar.dao.ProductListingPageDAO;
import com.ebazaar.databaseobject.dto.Item;
import com.ebazaar.databaseobject.query.QueryUtil;
import com.ebazaar.transferobject.dto.ItemDTO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ProductListingPageDAOImpl extends HibernateDaoSupport implements ProductListingPageDAO{
	
private QueryUtil queryUtil;
	
	public void setQueryUtil(QueryUtil queryUtil) {
		this.queryUtil = queryUtil;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ItemDTO> listAllItem(String product_id){
		List<ItemDTO> item = new ArrayList<ItemDTO>();
		Session session = getSession();		
		int product_Id=Integer.parseInt(product_id);
		//System.out.println("ProductListingPageDAOImpl product_id::"+product_Id);
		Query query = session.createQuery(queryUtil.getListItems());
		System.out.println(query.toString());
		query.setInteger("product_id", product_Id);
		//System.out.println(query.toString());
		List<Item> databaseItems =  query.list();
		//System.out.println("item list bases on product::"+databaseItems.size());
		
		if (databaseItems != null) {
			for (Item items : databaseItems) {
				ItemDTO itemDTO = new ItemDTO();
				itemDTO.setManufactureModelNumber(items.getManufactureModelNumber());	
				itemDTO.setDescription(items.getDescription());
				itemDTO.setListedPrice(items.getListedPrice());
				itemDTO.setSalePrice(items.getSalePrice());
				itemDTO.setInstock(items.getInstock());
				item.add(itemDTO);
				//System.out.println("ItemList size :"+item.size());
			}
		}		
		session.close();
		return item;
	}

	
}
