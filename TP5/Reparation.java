package TP5;
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
        
    }
    //reformer : retirer de l'utillisation 
    //une piece est reformable si elle tombe souvent en panne , on peut mettre un compteur pour savoir cmb de fois 
    //la piece a deja ete réparé 
    public boolean estRéformable() {

    }
    public void ajouterPièce(int réf, String nom, String constructeur,int quantité,double prix) {

    }
    public void ajouterPièce(Pièce pièce_rechange) {
        
    }
    public void modifierPièce(int réf, String nom, String constructeur,int quantité,double prix) {

    }

    public void supprimerPièce(int réf) {
         
    }

    public void afficherListePièces() {
        int compteur = 1; 
        System.out.println("************************Liste des pièces************************");
        for(Pièce pièce : listePiècesRep) {
            System.out.println("************Pièce N°"+compteur);
            System.out.println("Réference :"+pièce.getRéf());
            System.out.println("Nom :"+pièce.getNom());
            System.out.println("Quantité :"+pièce.getQuantité());
            System.out.println("Quantité Stock :"+pièce.getQuantitéStock());
            System.out.println("Prix :"+pièce.getPrix());
            compteur++;
        }
}

}

