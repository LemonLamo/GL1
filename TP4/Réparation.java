package TP4;

import java.util.Date;
import java.util.Vector;

public class Réparation {

	private Date dateRep; 
	private int nbHeure;
	private String travaux;
	private Vector<Pièce> listePièces;
	
	public Date getDateRep() {
		return dateRep;
	}
	public void setDateRep(Date dateRep) {
		this.dateRep = dateRep;
	}
	public int getNbHeure() {
		return nbHeure;
	}
	public void setNbHeure(int nbHeure) {
		this.nbHeure = nbHeure;
	}
	public String getTravaux() {
		return travaux;
	}
	public void setTravaux(String travaux) {
		this.travaux = travaux;
	} 
	
	public Vector<Pièce> getListePièces() {
		return listePièces;
	}
	public void setListePièces(Vector<Pièce> listePièces) {
		this.listePièces = listePièces;
	}
	public void afficherListePièces() {
		int compteur = 1; 
		System.out.println("************************Liste des pièces************************");
		for(Pièce pièce : listePièces) {
			System.out.println("************Pièce N°"+compteur);
			System.out.println("Réference :"+pièce.getRéf());
			System.out.println("Nom :"+pièce.getNom());
			System.out.println("Quantité :"+pièce.getQuantité());
			System.out.println("Quantité Stock :"+pièce.getQuantitéStock());
			System.out.println("Prix :"+pièce.getPrix());
			compteur++;
		}
		}

	public void ajouterPièce(Pièce p) {
	    if (p != null) {
	        listePièces.add(p);
	    } else {
	        System.out.println("Objet Pièce n'est pas instancié");
	    }
	}
	public void supprimerPièce(int réf) {
		int cpt = 0;
		for(Pièce pièce : listePièces) {
			if(pièce.getRéf() == réf) {
				listePièces.remove(cpt);
				break;
			}
			cpt++;
		}
	}


}
