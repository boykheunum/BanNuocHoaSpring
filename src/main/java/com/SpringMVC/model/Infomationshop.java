package com.SpringMVC.model;

public class Infomationshop {
  private int id_shop;
  private String adress;
  private String name;
  private String phonenumber;
  private float lat;
  private float lng;

  public float getLat() {
    return lat;
  }

  public void setLat(float lat) {
    this.lat = lat;
  }

  public float getLng() {
    return lng;
  }

  public void setLng(float lng ) {
    this.lng = lng;
  }

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

  public Infomationshop(int id_shop, String adress, String name, String phonenumber, float lat, float lng) {
    super();
    this.id_shop = id_shop;
    this.adress = adress;
    this.name = name;
    this.phonenumber = phonenumber;
    this.lat = lat;
    this.lng = lng;
  }

  public Infomationshop() {
    super();
  }

  public Infomationshop(String adress, String name, String phonenumber, float lat, float lng) {
    super();
    this.adress = adress;
    this.name = name;
    this.phonenumber = phonenumber;
    this.lat = lat;
    this.lng = lng;
  }

}
