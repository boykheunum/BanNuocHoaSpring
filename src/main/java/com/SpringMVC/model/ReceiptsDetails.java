package com.SpringMVC.model;


public class ReceiptsDetails {
	private int id_receipt;
	private int id_discount;
	private int unitPrice;
	private int id_product;
	private int amount;
	private int totalPrice;
	private int cash;

	public ReceiptsDetails() {
		super();
	}

	public ReceiptsDetails(int id_receipt, int id_discount, int unitPrice, int id_product, int amount, int totalPrice,
			int cash) {
		super();
		this.id_receipt = id_receipt;
		this.id_discount = id_discount;
		this.unitPrice = unitPrice;
		this.id_product = id_product;
		this.amount = amount;
		this.totalPrice = totalPrice;
		this.cash = cash;
	}

	public int getId_receipt() {
		return id_receipt;
	}

	public void setId_receipt(int id_receipt) {
		this.id_receipt = id_receipt;
	}

	public int getId_discount() {
		return id_discount;
	}

	public void setId_discount(int id_discount) {
		this.id_discount = id_discount;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}
}
