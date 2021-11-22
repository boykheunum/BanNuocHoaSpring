package com.SpringMVC.model;

public class Employees {
	private int id_employees;
	private String name;
	private String birthday;
	private String adress;
	private String email;
	private String username;
	private String password;
	private String phonenumber;
	private String avatar;
	private int id_job;
	private boolean sex;

	public int getId_employees() {
		return id_employees;
	}

	public void setId_employees(int id_employees) {
		this.id_employees = id_employees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getId_job() {
		return id_job;
	}

	public void setId_job(int id_job) {
		this.id_job = id_job;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Employees(int id_employees, String name, String birthday, String adress, String email, String username,
			String password, String phonenumber, String avatar, int id_job, boolean sex) {
		super();
		this.id_employees = id_employees;
		this.name = name;
		this.birthday = birthday;
		this.adress = adress;
		this.email = email;
		this.username = username;
		this.password = password;
		this.phonenumber = phonenumber;
		this.avatar = avatar;
		this.id_job = id_job;
		this.sex = sex;
	}

	public Employees() {
		super();
	}
}
