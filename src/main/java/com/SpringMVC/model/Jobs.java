package com.SpringMVC.model;

public class Jobs {
  private int id_job;
 
  private String name_job;
  

  public Jobs() {
    super();
  }

  public Jobs(int id_Job,String name_job) {
    super();
    this.id_job = id_Job;
    this.name_job = name_job;
    
  }

  public int getId_job() {
    return id_job;
  }

  public void setId_job(int id_job) {
    this.id_job = id_job;
  }

  public String getName_job() {
    return name_job;
  }

  public void setName_job(String name_job) {
    this.name_job = name_job;
  }

  public Jobs(String name_job) {
    super();
    this.name_job = name_job;
  }


}
