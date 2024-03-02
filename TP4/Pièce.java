package TP4;
public class Pièce {

	private int réf; 
	private String nom; 
	private int quantité; 
	private int quantitéStock; 
	private double prix; 
	
	public boolean isDispo(String nom) {
		return quantitéStock >= quantité;
	}
	
	public void enterStock(int quantité) {
		this.quantitéStock += quantité; 
	}
	
	public double calculerMontantPièce() {
		return prix * quantité; 
	}
	public Pièce(int réf, String nom, int quantité, int quantitéStock, double prix) {
		this.setRéf(réf);
		this.setNom(nom);
		this.quantité = quantité;
		this.quantitéStock = quantitéStock;
		this.prix = prix;
	}

	public int getRéf() {
		return réf;
	}

	public void setRéf(int réf) {
		this.réf = réf;
	}
	public int getQuantité() {
		return quantité;
	}

	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}
	public int getQuantitéStock() {
		return quantitéStock;
	}

	public void setQuantitéStock(int quantitéStock) {
		this.quantitéStock = quantitéStock;
	}
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}

