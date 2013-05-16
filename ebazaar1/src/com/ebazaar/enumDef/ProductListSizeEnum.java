package com.ebazaar.enumDef;

public enum ProductListSizeEnum {
	Ten("10"),
	Twenty("20"),
	Forty("40"),
	Sixty("60"),
	Hundred("100"),
	ShowAll("Show ALL");
	private String productListSize;
	private ProductListSizeEnum(String productListSize) {
		this.productListSize = productListSize;
	}
	
	
	public String getProductListSize() {
		return productListSize;
	}
}
