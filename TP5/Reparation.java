package TP5;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;


public class Reparation {
    private Date dateRéparation;
    private int nombreHeure;
    private String travaux;
    private Equipement equipement;
    private Technicien technicien;
    //private Pièce pièce;
    //private ArrayList<piece_echange> l=new ArrayList(); 
    //private Vector<Pièce> pièce_echange = new Vector<Pièce>();
	private Vector<Pièce> listePiècesRep;
	
	public Vector<Pièce> getListePièces() {
		return listePiècesRep;
	}
	public void setListePièces(Vector<Pièce> listePièces) {
		this.listePiècesRep = listePièces;
	}
    public Date getDateReparation() {
        return dateRéparation;
    }
    
    public void setDateReparation(Date dateReparation) {
        this.dateRéparation = dateReparation;
    }

    public int getNombreHeure() {
        return nombreHeure;
    }

    public void setNombreHeure(int nombreHeure) {
        this.nombreHeure = nombreHeure;
    }

    // Getter et Setter pour travaux
    public String getTravaux() {
        return travaux;
    }

    public void setTravaux(String travaux) {
        this.travaux = travaux;
    }

    public Equipement getEquipement() {
        return equipement;
    }

    public void setEquipement(Equipement equipement) {
        this.equipement = equipement;
    }

    public Technicien getTechnicien() {
        return technicien;
    }

    public void setTechnicien(Technicien technicien) {
        this.technicien = technicien;
    }

    public Reparation (Date dateRéparation , int nombreHeure, String travaux) {
      this.dateRéparation = dateRéparation;
      this.nombreHeure= nombreHeure;
      this.travaux= travaux;
       
    }
    public double calculerMontantRéparation() {
    	double montant = 0;
        for(Pièce p : listePiècesRep) {
        	montant = montant + p.getPrix()*p.getQuantité();
        }
        return montant;
    }
    //reformer : retirer de l'utillisation 
    //une piece est reformable si elle tombe souvent en panne , on peut mettre un compteur pour savoir cmb de fois 
    //la piece a deja ete réparé 
    public boolean estRéformable(int réf) {
    		if(occurencePièce(réf) >= 3) {
    			return true;
    		}
    		return false;
    }
    private int occurencePièce(int réf) {
    	int cpt=0;
    	for(Pièce p : listePiècesRep) {
    		if(p.getRéf() == réf) {
    			cpt++;
    		}
    	}
    	return cpt;
    }
    public void ajouterPièce(int réf, String nom, String constructeur,int quantité,double prix) {
    	this.listePiècesRep.add(new Pièce(réf, nom, constructeur, quantité, prix));
    }
    public void ajouterPièce(Pièce pièce_rechange) {
		this.listePiècesRep.add(pièce_rechange);
    }
    public void modifierPièce(int réf, String nom, String constructeur,int quantité,double prix) {
		int tmp =0;
		for(int i=0; i< this.listePiècesRep.size(); i++) {
			tmp = this.listePiècesRep.elementAt(i).getRéf();
			if(tmp == réf) {
				this.listePiècesRep.elementAt(i).setQuantité(quantité);
				this.listePiècesRep.elementAt(i).setPrix(prix);
				this.listePiècesRep.elementAt(i).setNom(nom);
				this.listePiècesRep.elementAt(i).setConstructeur(constructeur);
				return;
			}		
		}
		System.out.println("La pièce "+réf+" n\'existe pas");
		}
    
    
    public void supprimerPièce(int réf) {
    	int tmp =0;
		for(int i=0; i< this.listePiècesRep.size(); i++) {
			tmp = this.listePiècesRep.elementAt(i).getRéf();
			if(tmp == réf) {
				this.listePiècesRep.remove(i);
				return;
			}		
		}
		System.out.println("La pièce "+réf+" n\'existe pas");
		}
    

    public void afficherListePièces() {
        int compteur = 1; 
        System.out.println("************************Liste des pièces************************");
        for(Pièce pièce : listePiècesRep) {
            System.out.println("************Pièce N°"+compteur+"************");
            System.out.println("Réference :"+pièce.getRéf());
            System.out.println("Nom :"+pièce.getNom());
            System.out.println("Quantité :"+pièce.getQuantité());
            System.out.println("Quantité Stock :"+pièce.getQuantitéStock());
            System.out.println("Prix :"+pièce.getPrix());
            compteur++;
        }
}

}
