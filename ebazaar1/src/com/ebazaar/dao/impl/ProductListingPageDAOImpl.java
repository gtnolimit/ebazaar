package com.ebazaar.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ebazaar.dao.ProductListingPageDAO;
import com.ebazaar.databaseobject.dto.Item;
import com.ebazaar.databaseobject.dto.Manufacture;
import com.ebazaar.databaseobject.query.QueryUtil;
import com.ebazaar.transferobject.dto.ItemDTO;
import com.ebazaar.transferobject.dto.ManufactureDTO;
import com.ebazaar.transferobject.dto.PaginationDTO;

public class ProductListingPageDAOImpl extends HibernateDaoSupport implements ProductListingPageDAO{
	
private QueryUtil queryUtil;
	
	public void setQueryUtil(QueryUtil queryUtil) {
		this.queryUtil = queryUtil;
	}
	
	@SuppressWarnings("unchecked")
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
				itemDTO.setSubject(items.getSubject());
				item.add(itemDTO);
				//System.out.println("ItemList size :"+item.size());
			}
		}		
		session.close();
		return item;
	}

	
	
	
	public PaginationDTO getPaginatedResults(PaginationDTO paginationDTO) {
		List<ItemDTO> items = new ArrayList<ItemDTO>();
		List<Item> databaseItems = null;
		Session session = getSession();
		session.beginTransaction();
		//System.out.println("ProductListingPageDAOImpl product_id::"+product_Id);
		StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append(queryUtil.getListItems());
		if(paginationDTO.getProductSort() == null || paginationDTO.getProductSort().length() < 1) {
		
			
			queryBuilder.append("manufacture_id,itemId");
		} else {
			queryBuilder.append(paginationDTO.getProductSort());
		}
		Query query = session.createQuery(queryBuilder.toString());
		query = query.setFirstResult(paginationDTO.getPageSize() * (paginationDTO.getPageNumber() - 1));
		query.setMaxResults(paginationDTO.getPageSize());
		System.out.println(query.toString());
		query.setInteger("product_id", new Integer(paginationDTO.getProductId().toString()));
		//System.out.println(query.toString());
		databaseItems =  query.list();
		//System.out.println("item list bases on product::"+databaseItems.size());
		
		
		Map<Integer,ManufactureDTO> manufacturerMap = new HashMap<Integer,ManufactureDTO>();
		if (databaseItems != null) {
			for (Item item : databaseItems) {
				ManufactureDTO manufactureDTO = null;
				Manufacture manufacture = item.getManufacture();
				if(manufacturerMap.get(manufacture.getManufacture_id()) == null) {
					manufactureDTO = new ManufactureDTO();
					manufactureDTO.setImagePath(manufacture.getAuthorizePicture());
					manufactureDTO.setManufactureName(manufacture.getName());
					manufacturerMap.put(manufacture.getManufacture_id(), manufactureDTO);
				} else {
					manufactureDTO = manufacturerMap.get(manufacture.getManufacture_id());
				}
				ItemDTO itemDTO = new ItemDTO();
				manufactureDTO.getItems().add(itemDTO);
				itemDTO.setManufactureModelNumber(item.getManufactureModelNumber());	
				itemDTO.setDescription(item.getDescription());
				itemDTO.setListedPrice(item.getListedPrice());
				itemDTO.setSalePrice(item.getSalePrice());
				itemDTO.setInstock(item.getInstock());
				itemDTO.setSubject(item.getSubject());
				
				
				itemDTO.setPageLocator(item.getPageLocator());
				itemDTO.setItemId(item.getItemId());
				items.add(itemDTO);
				//System.out.println("ItemList size :"+item.size());
			}
		}
		
		paginationDTO.setItems(new ArrayList<ManufactureDTO>(manufacturerMap.values()));
		session.beginTransaction().commit();
		Criteria criteria = session.createCriteria(Item.class);
		criteria.setProjection(Projections.rowCount());
		criteria.add(Restrictions.eq("product_id", paginationDTO.getProductId()));
		
		
		System.out.println(criteria.uniqueResult());
		paginationDTO.setTotalRecords(new Long(criteria.uniqueResult().toString()));
		session.close();
		return paginationDTO;
	}

	
}
