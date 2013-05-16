package com.ebazaar.util;

import java.util.ArrayList;
import java.util.List;

import com.ebazaar.transferobject.dto.PageDisplayIndexesDTO;
import com.ebazaar.transferobject.dto.PaginationDTO;

public class PaginationUtil {

	public void decorateIndexes(PaginationDTO paginationDTO) {
		long numberOfPages = 0;
		
		
		if((paginationDTO.getTotalRecords() % paginationDTO.getPageSize()) == 0) {
			numberOfPages = (paginationDTO.getTotalRecords()/paginationDTO.getPageSize());
		} else {
			numberOfPages = (paginationDTO.getTotalRecords()/paginationDTO.getPageSize()) + 1;
		}
		List<PageDisplayIndexesDTO> pageDisplayIndexes = new ArrayList<PageDisplayIndexesDTO>(); 
		if(paginationDTO.getPageNumber() == 1) {
			PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
			pageDisplayIndexesDTO.setDisplayPageIndex(EBazaarConstants.previousIndex);
			pageDisplayIndexesDTO.setEnabled(false);
			pageDisplayIndexesDTO.setCurrentPage(false);
			
			
			pageDisplayIndexes.add(pageDisplayIndexesDTO);
		} else {
			PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
			pageDisplayIndexesDTO.setDisplayPageIndex(EBazaarConstants.previousIndex);
			pageDisplayIndexesDTO.setEnabled(true);
			pageDisplayIndexesDTO.setCurrentPage(false);
			pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(),paginationDTO.getPageNumber()-1, paginationDTO.getPageSize()));
			pageDisplayIndexes.add(pageDisplayIndexesDTO);
		}
		
		
		if(numberOfPages <= 10) {
			if(numberOfPages <= 5) {
				for(int i = 1; i <= numberOfPages; i++) {
					PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
					pageDisplayIndexesDTO.setDisplayPageIndex(i+"");
					pageDisplayIndexesDTO.setEnabled(true);
					if(i == paginationDTO.getPageNumber()) {
						pageDisplayIndexesDTO.setCurrentPage(true);
					} else {
						pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(), i, paginationDTO.getPageSize()));
						pageDisplayIndexesDTO.setCurrentPage(false);
					}
					pageDisplayIndexes.add(pageDisplayIndexesDTO);
				}
			} else {
				if(paginationDTO.getPageNumber() <= 5) {
					for(int i = 1; i <=5 ; i++) {
						PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
						pageDisplayIndexesDTO.setDisplayPageIndex(i+"");
						pageDisplayIndexesDTO.setEnabled(true);
						if(i == paginationDTO.getPageNumber()) {
							pageDisplayIndexesDTO.setCurrentPage(true);
						} else {
							pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(), i, paginationDTO.getPageSize()));
							pageDisplayIndexesDTO.setCurrentPage(false);
						}
						pageDisplayIndexes.add(pageDisplayIndexesDTO);
					}
				} else {
					for(int i = 1; i <=2 ; i++) {
						PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
						pageDisplayIndexesDTO.setDisplayPageIndex(i+"");
						pageDisplayIndexesDTO.setEnabled(true);
						pageDisplayIndexesDTO.setCurrentPage(false);
						pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(), i, paginationDTO.getPageSize()));
						pageDisplayIndexes.add(pageDisplayIndexesDTO);
					}
					PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
					pageDisplayIndexesDTO.setDisplayPageIndex(EBazaarConstants.paginationGap);
					pageDisplayIndexesDTO.setEnabled(false);
					pageDisplayIndexesDTO.setCurrentPage(false);
					pageDisplayIndexes.add(pageDisplayIndexesDTO);
					for(int i = 6; i <= numberOfPages; i++) {
						pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
						pageDisplayIndexesDTO.setDisplayPageIndex(i+"");
						pageDisplayIndexesDTO.setEnabled(true);
						if(i == paginationDTO.getPageNumber()) {
							pageDisplayIndexesDTO.setCurrentPage(true);
						} else {
							pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(), i, paginationDTO.getPageSize()));
							pageDisplayIndexesDTO.setCurrentPage(false);
						}
						pageDisplayIndexes.add(pageDisplayIndexesDTO);
					}
				}
			}
		} else {
			if(paginationDTO.getPageNumber() <= 5) {
				for(int i = 1; i <=5 ; i++) {
					PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
					pageDisplayIndexesDTO.setDisplayPageIndex(i+"");
					pageDisplayIndexesDTO.setEnabled(true);
					if(i == paginationDTO.getPageNumber()) {
						pageDisplayIndexesDTO.setCurrentPage(true);
					} else {
						pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(), i, paginationDTO.getPageSize()));
						pageDisplayIndexesDTO.setCurrentPage(false);
					}
					pageDisplayIndexes.add(pageDisplayIndexesDTO);
				}
				PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
				pageDisplayIndexesDTO.setDisplayPageIndex(EBazaarConstants.paginationGap);
				pageDisplayIndexesDTO.setEnabled(false);
				pageDisplayIndexesDTO.setCurrentPage(false);
				pageDisplayIndexes.add(pageDisplayIndexesDTO);
				for(int i = (int)(numberOfPages-2); i <= numberOfPages; i++) {
					pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
					pageDisplayIndexesDTO.setDisplayPageIndex(i+"");
					pageDisplayIndexesDTO.setEnabled(true);
					pageDisplayIndexesDTO.setCurrentPage(false);
					pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(), i, paginationDTO.getPageSize()));
					pageDisplayIndexes.add(pageDisplayIndexesDTO);
				}
			
			} else if((paginationDTO.getPageNumber() < (numberOfPages-5)) && (paginationDTO.getPageNumber() > 5) ) {
				for(int i = 1; i <=2 ; i++) {
					PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
					pageDisplayIndexesDTO.setDisplayPageIndex(i+"");
					pageDisplayIndexesDTO.setEnabled(true);
					pageDisplayIndexesDTO.setCurrentPage(false);
					pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(), i, paginationDTO.getPageSize()));
					pageDisplayIndexes.add(pageDisplayIndexesDTO);
				}
				PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
				pageDisplayIndexesDTO.setDisplayPageIndex(EBazaarConstants.paginationGap);
				pageDisplayIndexesDTO.setEnabled(false);
				pageDisplayIndexesDTO.setCurrentPage(false);
				pageDisplayIndexes.add(pageDisplayIndexesDTO);
				for(int i = (int)(paginationDTO.getPageNumber()-2); i <=(paginationDTO.getPageNumber()+2) ; i++) {
					pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
					pageDisplayIndexesDTO.setDisplayPageIndex(i+"");
					pageDisplayIndexesDTO.setEnabled(true);
					if(i == paginationDTO.getPageNumber()) {
						pageDisplayIndexesDTO.setCurrentPage(true);
					} else {
						pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(), i, paginationDTO.getPageSize()));
						pageDisplayIndexesDTO.setCurrentPage(false);
					}
					pageDisplayIndexes.add(pageDisplayIndexesDTO);
				}
				pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
				pageDisplayIndexesDTO.setDisplayPageIndex(EBazaarConstants.paginationGap);
				pageDisplayIndexesDTO.setEnabled(false);
				pageDisplayIndexesDTO.setCurrentPage(false);
				pageDisplayIndexes.add(pageDisplayIndexesDTO);
				for(int i = (int)(numberOfPages-2); i <= numberOfPages; i++) {
					pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
					pageDisplayIndexesDTO.setDisplayPageIndex(i+"");
					pageDisplayIndexesDTO.setEnabled(true);
					pageDisplayIndexesDTO.setCurrentPage(false);
					pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(), i, paginationDTO.getPageSize()));
					pageDisplayIndexes.add(pageDisplayIndexesDTO);
				}
			} else {
				for(int i = 1; i <=2 ; i++) {
					PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
					pageDisplayIndexesDTO.setDisplayPageIndex(i+"");
					pageDisplayIndexesDTO.setEnabled(true);
					pageDisplayIndexesDTO.setCurrentPage(false);
					pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(), i, paginationDTO.getPageSize()));
					pageDisplayIndexes.add(pageDisplayIndexesDTO);
				}
				PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
				pageDisplayIndexesDTO.setDisplayPageIndex(EBazaarConstants.paginationGap);
				pageDisplayIndexesDTO.setEnabled(false);
				pageDisplayIndexesDTO.setCurrentPage(false);
				pageDisplayIndexes.add(pageDisplayIndexesDTO);
				for(int i = (int)(numberOfPages-5); i <=(numberOfPages) ; i++) {
					pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
					pageDisplayIndexesDTO.setDisplayPageIndex(i+"");
					pageDisplayIndexesDTO.setEnabled(true);
					if(i == paginationDTO.getPageNumber()) {
						pageDisplayIndexesDTO.setCurrentPage(true);
					} else {
						pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(), i, paginationDTO.getPageSize()));
						pageDisplayIndexesDTO.setCurrentPage(false);
					}
					pageDisplayIndexes.add(pageDisplayIndexesDTO);
				}
			}
		}
		if(paginationDTO.getPageNumber() == numberOfPages) {
			PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
			pageDisplayIndexesDTO.setDisplayPageIndex(EBazaarConstants.nextIndex);
			pageDisplayIndexesDTO.setEnabled(false);
			pageDisplayIndexesDTO.setCurrentPage(false);
			pageDisplayIndexes.add(pageDisplayIndexesDTO);
		} else {
			
			PageDisplayIndexesDTO pageDisplayIndexesDTO = new PageDisplayIndexesDTO();
			pageDisplayIndexesDTO.setDisplayPageIndex(EBazaarConstants.nextIndex);
			pageDisplayIndexesDTO.setEnabled(true);
			pageDisplayIndexesDTO.setPageNavigationHref(hrefBuilder(paginationDTO.getProductId(), paginationDTO.getPageNumber()+1, paginationDTO.getPageSize()));
			
			pageDisplayIndexesDTO.setCurrentPage(false);
			pageDisplayIndexes.add(pageDisplayIndexesDTO);
		}
		paginationDTO.setPageDisplayIndexes(pageDisplayIndexes);
		
		int startIndex = (paginationDTO.getPageSize() * (paginationDTO.getPageNumber() - 1))+1;
		StringBuffer displayStatusBuffer = new StringBuffer();
		displayStatusBuffer.append(startIndex);
		displayStatusBuffer.append(" - ");
		displayStatusBuffer.append(startIndex + paginationDTO.getPageSize()-1);

		
		displayStatusBuffer.append(" of ");
		displayStatusBuffer.append(paginationDTO.getTotalRecords());
		paginationDTO.setPageDisplayStatus(displayStatusBuffer.toString());
	}

	
	private String hrefBuilder(Long productId, int pageNumber, int pageSize) {
		StringBuilder hrefBuilder = new StringBuilder();
		hrefBuilder.append("itemListing.htm?product_id=");
		hrefBuilder.append(productId);
		hrefBuilder.append("&amp;pageNumber=");
		hrefBuilder.append(pageNumber);
		hrefBuilder.append("&amp;pageSize=");
		
		hrefBuilder.append(pageSize);
		return hrefBuilder.toString();
	}
}
