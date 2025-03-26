package model;

import java.util.Arrays;
import java.util.Map;

public class Product {
	Map<Integer,String>productInfo;
	String[]category;
	public Map<Integer, String> getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(Map<Integer, String> productInfo) {
		this.productInfo = productInfo;
	}
	public String[] getCategory() {
		return category;
	}
	public void setCategory(String[] category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [productInfo=" + productInfo + ", category=" + Arrays.toString(category) + "]";
	}

}
