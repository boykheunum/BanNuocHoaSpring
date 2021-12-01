package com.SpringMVC.model;

public class TypeProduct {
	private int id_type_product;
	private String typeProduct;
	public TypeProduct() {
		super();
	}
	public TypeProduct(int id_type_product, String typeProduct) {
		super();
		this.id_type_product = id_type_product;
		this.typeProduct = typeProduct;
	}
	   public TypeProduct(String typeProduct) {
	        super();
	        this.typeProduct = typeProduct;
	    }
	public int getId_type_product() {
		return id_type_product;
	}
	public void setId_type_product(int id_type_product) {
		this.id_type_product = id_type_product;
	}
	public String getTypeProduct() {
		return typeProduct;
	}
	public void setTypeProduct(String typeProduct) {
		this.typeProduct = typeProduct;
	}
	
}
