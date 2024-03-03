package TP4;

import java.util.Date;
import java.util.Vector;
public class Réparation {

	private Date dateRep; 
	private int nbHeure;
	private String travaux;
	//on peut avoir plusieurs pieces dans la mm reparation 
    //creer un vecteur pour montrer l'aggregation
	private Vector<Pièce> listePiècesRep;
	
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
		return listePiècesRep;
	}
	public void setListePièces(Vector<Pièce> listePièces) {
		this.listePiècesRep = listePièces;
	}

	public void afficherListePièces() {
		int compteur = 1; 
		System.out.println("************************Liste des pièces************************ \n");
		for(Pièce pièce : listePiècesRep) {
			System.out.println("Pièce N° :"+compteur);
			System.out.println("Réference :"+pièce.getRéf());
			System.out.println("Nom :"+pièce.getNom());
			System.out.println("Quantité :"+pièce.getQuantité());
			System.out.println("Quantité Stock :"+pièce.getQuantitéStock());
			System.out.println("Prix :"+pièce.getPrix());
			System.out.println("  ");
			compteur++;
		}
		}
		
	public void ajouterPièce(Pièce p) {
	    if (p != null) {
	        listePiècesRep.add(p);
	     
	    } else {
	        System.out.println("Objet Pièce n'est pas instancié");
	    }
	}
	public void ajouterPièce(int réf, String nom , int quantité , double prix ) {
		
		Pièce p = new Pièce(réf , nom , quantité , prix);
		listePiècesRep.add(p);
		
	}
	public void supprimerPièce(int réf) {
		int cpt = 0;
		for(Pièce pièce : listePiècesRep) {
			if(pièce.getRéf() == réf) {
				listePiècesRep.remove(cpt);
				Pièce.quantitéStock--;
				break;
			}
		  cpt++;
		}
		System.out.println("");
	}
	
	public void modifierPièce(Pièce p) {
		int cpt = 0; 
		for (Pièce pièce : listePiècesRep) {
			if(p.getRéf() == pièce.getRéf()) {
				listePiècesRep.elementAt(cpt).setNom(pièce.getNom());
				listePiècesRep.elementAt(cpt).setPrix(pièce.getPrix());
				listePiècesRep.elementAt(cpt).setQuantité(pièce.getQuantité());		
				break;
		}
		cpt++;
		}
	}

	public void modifierPièce(int réf, String nom , int quantité , double prix ) {
		int cpt = 0; 
		for (Pièce pièce : listePiècesRep) {
			if(réf == pièce.getRéf()) {
				listePiècesRep.elementAt(cpt).setNom(nom);
				listePiècesRep.elementAt(cpt).setPrix(prix);
				listePiècesRep.elementAt(cpt).setQuantité(quantité);
				break;
		}
		cpt++;
		}
	}
	public double calculerPrixRep(Equipement e) {
		double total = 0.0; 
		
		for (Pièce pièce : listePiècesRep) {
			if(e.isPieceDefectueuse(pièce.getRéf())) {
				total += e.getPièceByRéf(pièce.getRéf()).calculerMontantPièce();
			}	
		}
		return total+this.nbHeure*2000;
	}
}
