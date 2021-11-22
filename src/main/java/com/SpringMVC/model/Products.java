package com.SpringMVC.model;

public class Products {
	private int id_product;
	private String nameProduct;
	private String imageProduct;
	private int price;
	private int importPrice;
	private int quantity;
	private String descriotion;
	private int id_type_product;
	public int getId_product() {
		return id_product;
	}
	public void setId_product(int id_product) {
		this.id_product = id_product;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public String getImageProduct() {
		return imageProduct;
	}
	public void setImageProduct(String imageProduct) {
		this.imageProduct = imageProduct;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getImportPrice() {
		return importPrice;
	}
	public void setImportPrice(int importPrice) {
		this.importPrice = importPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescriotion() {
		return descriotion;
	}
	public void setDescriotion(String descriotion) {
		this.descriotion = descriotion;
	}
	public int getId_type_product() {
		return id_type_product;
	}
	public void setId_type_product(int id_type_product) {
		this.id_type_product = id_type_product;
	}
	public Products(int id_product, String nameProduct, String imageProduct, int price, int importPrice, int quantity,
			String descriotion, int id_type_product) {
		super();
		this.id_product = id_product;
		this.nameProduct = nameProduct;
		this.imageProduct = imageProduct;
		this.price = price;
		this.importPrice = importPrice;
		this.quantity = quantity;
		this.descriotion = descriotion;
		this.id_type_product = id_type_product;
	}
	public Products(String nameProduct, String imageProduct, int price, int importPrice, int quantity,
			String descriotion, int id_type_product) {
		super();
		this.nameProduct = nameProduct;
		this.imageProduct = imageProduct;
		this.price = price;
		this.importPrice = importPrice;
		this.quantity = quantity;
		this.descriotion = descriotion;
		this.id_type_product = id_type_product;
	}
	public Products() {
		super();
	}


}
