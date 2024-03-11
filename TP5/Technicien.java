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
Technicien(int matricule){
	this.matricule = matricule;
}

public void designerChefDequipe(Technicien nouveauChef) {
	if(nouveauChef !=null) {
		this.chefEquipe = nouveauChef;
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
}
