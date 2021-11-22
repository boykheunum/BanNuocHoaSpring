package com.SpringMVC.model;

public class Image {
	private int id_type_image;
	private int id_image;
	private String image;

	public Image() {
		super();
	}

	public Image(int id_type_image, int id_image, String image) {
		super();
		this.id_type_image = id_type_image;
		this.id_image = id_image;
		this.image = image;
	}

	public int getId_type_image() {
		return id_type_image;
	}

	public void setId_type_image(int id_type_image) {
		this.id_type_image = id_type_image;
	}

	public int getId_image() {
		return id_image;
	}

	public void setId_image(int id_image) {
		this.id_image = id_image;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
