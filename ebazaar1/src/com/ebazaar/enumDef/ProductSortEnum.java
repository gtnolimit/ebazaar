package com.ebazaar.enumDef;

public enum ProductSortEnum {
	Manufacturer("Manufacturer","manufacture_id,itemId"),
//	BestSelling("Best Selling","selling desc"),
	PriceAsc("Price ($ to $$$)","salePrice asc"),
	PriceDesc("Price ($$$ to $)","salePrice desc");
	//Rating("Rating","rating,desc");
	private String productSortDesc;
	private String productSortValue;
	private ProductSortEnum(String productSortDesc, String productSortValue) {
		this.productSortDesc = productSortDesc;
		this.productSortValue = productSortValue;
	}
	public String getProductSortDesc() {
		return this.productSortDesc;
	}
	public String getProductSortValue() {
		return this.productSortValue;
	}
}
