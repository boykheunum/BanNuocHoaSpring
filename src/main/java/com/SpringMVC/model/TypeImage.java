package com.SpringMVC.model;

public class TypeImage {
	private int id_type_image;
	private String nameTypeImage;

	public TypeImage() {
		super();
	}

	public TypeImage(int id_type_image, String nameTypeImage) {
		super();
		this.id_type_image = id_type_image;
		this.nameTypeImage = nameTypeImage;
	}

	public int getId_type_image() {
		return id_type_image;
	}

	public void setId_type_image(int id_type_image) {
		this.id_type_image = id_type_image;
	}

	public String getNameTypeImage() {
		return nameTypeImage;
	}

	public void setNameTypeImage(String nameTypeImage) {
		this.nameTypeImage = nameTypeImage;
	}
}
