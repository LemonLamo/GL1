package TP4;

import java.util.Date;
import java.util.Vector;
public class Planning {
	
	private  int numP;
	private Vector<Maintenance> listeMaintenance;
	
	Planning(int numP, Date datesMaint[] , int nbHeures[] , String travaux[], Vector<Pièce> listePiècesMaint ){
		this.numP = numP;
		Vector<Maintenance> listeMain = new Vector<>();
		for(int i=0 ; i< datesMaint.length; i++) {
			Maintenance m1 = new Maintenance(datesMaint[i], nbHeures[i], travaux[i]);
			m1.setListePiècesMaint(listePiècesMaint);
			listeMain.add(m1);
		}
		this.listeMaintenance = listeMain;
	}

	public Vector<Maintenance> getListeMaintenance() {
		return listeMaintenance;
	}

	public void setListeMaintenance(Vector<Maintenance> listeMaintenance) {
		this.listeMaintenance = listeMaintenance;
	}
	
	public void afficherListeMaint() {
		
		for(Maintenance maint : listeMaintenance) {
			System.out.println("Maintenance du "+maint.getDateMaint());
			System.out.println("Travaux a faire : "+maint.getTravaux());
			System.out.println("Nombre d'heures estimées : "+ maint.getTravaux());
			System.out.println("Pièces utilisées");
			maint.afficherListePièces();
		}
	}
	
	public void supprimerMaint(Date dateMaint) {
		int cpt =0; 
		for(Maintenance maint : listeMaintenance) {
			if(maint.getDateMaint() == dateMaint) {
				listeMaintenance.remove(cpt);
				break;
			}
			cpt++;
		}
	}
	
	public void modifierMaint(Date dateMaint , int nbHeure , String travaux) {
		int cpt =0; 
		for(Maintenance maint : listeMaintenance) {
			if(maint.getDateMaint() == dateMaint) {
				listeMaintenance.get(cpt).setDateMaint(dateMaint);
				listeMaintenance.get(cpt).setNbHeure(nbHeure);
				listeMaintenance.get(cpt).setTravaux(travaux);
				break;
			}
			cpt++;
		}
	}
	
	public void ajouterMaint(Date dateMaint , int nbHeure , String travaux, Vector<Pièce> listePièce) {
		listeMaintenance.add(new Maintenance(dateMaint,nbHeure,travaux,listePièce));
	}

	private  class Maintenance {
		 private Date dateMaint; 
		 private int nbHeure; 
		 private String travaux;
		 private Vector<Pièce> listePiècesMaint;
		
		 Maintenance(Date dateMaint , int nbHeure , String travaux){
			 this.dateMaint = dateMaint;
			 this.nbHeure = nbHeure;
			 this.travaux = travaux;
			 this.listePiècesMaint = listePiècesMaint;
		 }
		 Maintenance(Date dateMaint , int nbHeure , String travaux, Vector<Pièce> v1){
			 this.dateMaint = dateMaint;
			 this.nbHeure = nbHeure;
			 this.travaux = travaux;
			 this.listePiècesMaint = v1;
		 }
		public int getNbHeure() {
			return nbHeure;
		}
		public void setNbHeure(int nbHeure) {
			this.nbHeure = nbHeure;
		}
		public Date getDateMaint() {
			return dateMaint;
		}
		public void setDateMaint(Date dateMaint) {
			this.dateMaint = dateMaint;
		}
		public String getTravaux() {
			return travaux;
		}
		public void setTravaux(String travaux) {
			this.travaux = travaux;
		}
		public Vector<Pièce> getListePiècesMaint() {
			return listePiècesMaint;
		}
		public void setListePiècesMaint(Vector<Pièce> listePiècesMaint) {
			this.listePiècesMaint = listePiècesMaint;
		} 
		public void afficherListePièces() {
			int compteur = 1; 
			System.out.println("************************Liste des pièces************************");
			for(Pièce pièce : listePiècesMaint) {
				System.out.println("************Pièce N°"+compteur);
				System.out.println("Réference :"+pièce.getRéf());
				System.out.println("Nom :"+pièce.getNom());
				System.out.println("Quantité :"+pièce.getQuantité());
				System.out.println("Quantité Stock :"+pièce.getQuantitéStock());
				System.out.println("Prix :"+pièce.getPrix());
				compteur++;
			}
			}
		public void supprimerPièce(int réf) {
			int cpt = 0;
			for(Pièce pièce : listePiècesMaint) {
				if(pièce.getRéf() == réf) {
					listePiècesMaint.remove(cpt);
					break;
				}
				cpt++;
				Pièce.quantitéStock--;
			}
		}
		public void modifierPièce(int réf, String nom , int quantité , double prix ) {
			int cpt = 0; 
			for (Pièce pièce : listePiècesMaint) {
				if(réf == pièce.getRéf()) {
					listePiècesMaint.elementAt(cpt).setNom(nom);
					listePiècesMaint.elementAt(cpt).setPrix(prix);
					listePiècesMaint.elementAt(cpt).setQuantité(quantité);
					break;
			}
			cpt++;
			}
		}
		public void ajouterPièce(Pièce p) {
		    if (p != null) {
		    	listePiècesMaint.add(p);
		        Pièce.quantitéStock++;
		    } else {
		        System.out.println("Objet Pièce n'est pas instancié");
		    }
		}
		public void ajouterPièce(int réf, String nom , int quantité , double prix ) {
			
			Pièce p = new Pièce(réf , nom , quantité , prix);
			listePiècesMaint.add(p);
			Pièce.quantitéStock++;
			
		}
		}


}