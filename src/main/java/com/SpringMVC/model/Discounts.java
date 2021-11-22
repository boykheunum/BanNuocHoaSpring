package com.SpringMVC.model;

public class Discounts {
	private int id_discount;
	private String code;

	public int getId_discount() {
		return id_discount;
	}

	public void setId_discount(int id_discount) {
		this.id_discount = id_discount;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Discounts(int id_discount, String code) {
		super();
		this.id_discount = id_discount;
		this.code = code;
	}

	public Discounts() {
		super();
	}

}
