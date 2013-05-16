package com.ebazaar.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ebazaar.dao.ItemDetailDAO;
import com.ebazaar.databaseobject.dto.Item;
import com.ebazaar.databaseobject.query.QueryUtil;
import com.ebazaar.transferobject.dto.ItemDTO;
public class ItemDetailDAOImpl extends HibernateDaoSupport implements ItemDetailDAO{
	private QueryUtil queryUtil;
	
	
	public void setQueryUtil(QueryUtil queryUtil) {
		this.queryUtil = queryUtil;
	}
	
	@SuppressWarnings("unchecked")
	public ItemDTO getItem(Long itemId) {
		
		ItemDTO itemDTO = null;
		Session session = getSession();
		Query query = session.createQuery(queryUtil.getItem());
		
		
		query.setLong("itemId", itemId);
		Item item =  (Item)query.uniqueResult();
		if(item != null) {
			itemDTO = new ItemDTO();
			itemDTO.setPageLocator(item.getPageLocator());
		}
		session.close();
		return itemDTO;
	}

}
