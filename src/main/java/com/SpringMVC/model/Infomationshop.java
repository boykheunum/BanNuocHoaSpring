package com.SpringMVC.model;

public class Infomationshop {
	private int id_shop;
	private String adress;
	private String name;
	private String phonenumber;
	public int getId_shop() {
		return id_shop;
	}
	public void setId_shop(int id_shop) {
		this.id_shop = id_shop;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Infomationshop(int id_shop, String adress, String name, String phonenumber) {
		super();
		this.id_shop = id_shop;
		this.adress = adress;
		this.name = name;
		this.phonenumber = phonenumber;
	}
	public Infomationshop() {
		super();
	}

}
