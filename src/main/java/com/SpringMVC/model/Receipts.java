package com.SpringMVC.model;

public class Receipts {
	private int id_receipt;
	private String date;
	private int cash;
	private int id_user;

	public Receipts() {
		super();
	}

	public Receipts(int id_receipt, String date, int cash, int id_user) {
		super();
		this.id_receipt = id_receipt;
		this.date = date;
		this.cash = cash;
		this.id_user = id_user;
	}

	public int getId_receipt() {
		return id_receipt;
	}

	public void setId_receipt(int id_receipt) {
		this.id_receipt = id_receipt;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	
}
