package com.SpringMVC.model;

public class Process {
	private int id_receipt;
	private boolean status;
	private String id_employees;

	public Process() {
		super();
	}

	public Process(int id_receipt, boolean status, String id_employees) {
		super();
		this.id_receipt = id_receipt;
		this.status = status;
		this.id_employees = id_employees;
	}

	public int getId_receipt() {
		return id_receipt;
	}

	public void setId_receipt(int id_receipt) {
		this.id_receipt = id_receipt;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getId_employees() {
		return id_employees;
	}

	public void setId_employees(String id_employees) {
		this.id_employees = id_employees;
	}
}
