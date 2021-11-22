package com.SpringMVC.model;

public class Users {
	private int id_user;
	private String name;
	private String birthDay;
	private String adress;
	private boolean sex;
	private String email;
	private String username;
	private String password;
	private String phonenumber;
	private String avatar;

	public Users() {
		super();
	}

	public Users(int id_user, String name, String birthDay, String adress, boolean sex, String email, String username,
			String password, String phonenumber, String avatar) {
		super();
		this.id_user = id_user;
		this.name = name;
		this.birthDay = birthDay;
		this.adress = adress;
		this.sex = sex;
		this.email = email;
		this.username = username;
		this.password = password;
		this.phonenumber = phonenumber;
		this.avatar = avatar;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
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
}
