package com.rsv.beans;

public class Client {
  private String nom;
  private String prenom;
  private String email;
  private String telephone;
  private Reservation reservation;
  
  
public Reservation getReservation() {
	return reservation;
}


public void setReservation(Reservation reservation) {
	this.reservation = reservation;
}


public Client() {

	
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getTelephone() {
	return telephone;
}


public void setTelephone(String telephone) {
	this.telephone = telephone;
}
  
  
  
  
}
