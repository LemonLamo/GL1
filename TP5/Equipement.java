package TP5;

public class Equipement {
	
	private int numSérie;
	private String désignation;
	private double prix;
	private Fournisseur fournisseur;
	private Atelier atelier;
	public Equipement type;
	public int getNumSérie() {
		return numSérie;
	}
	public void setNumSérie(int numSérie) {
		this.numSérie = numSérie;
	}
	public String getDésignation() {
		return désignation;
	}
	public void setDésignation(String désignation) {
		this.désignation = désignation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	} 
	
	public Equipement(String désignation,int numSérie, double prix){
		this.désignation = désignation;
		this.numSérie = numSérie;
		this.prix = prix;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	
	
	public void ajouterFournisseur(Fournisseur f) {
		this.fournisseur = f;
	}
	
	public void supprimerFournisseur(Fournisseur f) {
		if(this.fournisseur != null) {
			if(this.fournisseur.getNumRC() == f.getNumRC()) {
				this.fournisseur = null;
			}else {
				System.out.println("Le fournisseur fournie n\'existe pas");
			}
		}else {
			System.out.println("Erreur lors de la suppression du Fournisseur : 404 n\'existe pas");
		}
	}
	public Atelier getAtelier() {
		return atelier;
	}
	public void setAtelier(Atelier atelier) {
		this.atelier = atelier;
	}
}