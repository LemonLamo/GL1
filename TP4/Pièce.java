package TP4;
// les classes statiques ne puevent pas exister en dehors d'une classe instantciable
class Pièce {

	private int réf; 
	private String nom; 
	private int quantité; 
	static int quantitéStock; 
	private double prix; 
	
	public boolean isDispo(String nom) {
		return quantitéStock >= quantité;
	}
	
	public void enterStock(int quantité) {
		quantitéStock += quantité; 
	}
	
	public double calculerMontantPièce() {
		return prix * quantité; 
	}
	public Pièce(int réf, String nom, int quantité, double prix) {
		this.setRéf(réf);
		this.setNom(nom);
		this.quantité = quantité;		
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


