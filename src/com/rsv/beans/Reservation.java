package com.rsv.beans;

public class Reservation {

	  private String type;
	  private Double prix;
	  private String option;
	  
	  
	  public Reservation() {
		  
	  }


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Double getPrix() {
		return prix;
	}


	public void setPrix(Double prix) {
		this.prix = prix;
	}


	public String getOption() {
		return option;
	}


	public void setOption(String option) {
		this.option = option;
	}
	  
}
