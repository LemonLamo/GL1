package TP5;

import java.util.Vector;

public class Technicien {
private int matricule; 
public Specialite specialité; 
public Vehicule engine;
private Technicien chefEquipe ;
private Vector<Technicien> membre;

public int getMatricule() {
	return this.matricule;
}
Technicien(int matricule, Specialite sp){
	this.matricule = matricule;
	this.specialité = sp;
}

public void setVehicule(Vehicule v1) {
	this.engine = v1;
}
public void designerChefDequipe(Technicien nouveauChef) {
	if(nouveauChef !=null && this.membre != null ) {
		this.setChefEquipe(nouveauChef);
		for(int i =0 ; i<this.membre.size(); i++) {
			if(this.membre.elementAt(i).getMatricule() == nouveauChef.getMatricule()) {
				this.membre.setElementAt(nouveauChef, i);
			}
		}
		return;
	}else {
		System.out.println("L\'objet n\'est pas instancié");
	}
}
public Technicien getChefEquipe() {
	return chefEquipe;
}
public void setChefEquipe(Technicien chefEquipe) {
	this.chefEquipe = chefEquipe;
}
public void setMembres(Vector<Technicien> t) {
	this.membre = t;
}
}
