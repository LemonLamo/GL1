package TP5;

public class Vehicule {
private int immatricule;
private String marque ; 
private Technicien conducteur;

Vehicule(int immatricule, String marque){
	this.setImmatricule(immatricule);
	this.setMarque(marque);
}

public void ajouterTechnicien(Technicien t){
	this.conducteur = t;
}

public String getMarque() {
	return marque;
}

public void setMarque(String marque) {
	this.marque = marque;
}

public int getImmatricule() {
	return immatricule;
}

public void setImmatricule(int immatricule) {
	this.immatricule = immatricule;
}
}
