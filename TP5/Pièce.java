package TP5;
// les classes statiques ne puevent pas exister en dehors d'une classe instantciable
class Pièce {

	private int réf; 
	private String nom; 
	private int quantité; 
	static int quantitéStock =0; 
    String constructeur;
	private double prix; 
	
	public boolean isDispo(String nom) {
		if (nom == this.nom) {
			return quantité <= quantitéStock;
		} 
		else return false;
	}
	
	public void enterStock(int quantité) {
		if (quantité <= 0) {
			System.out.println("la quantité doit etre positive");
		} else {
			quantitéStock += quantité;
		}
	}
	
	public double calculerMontantPièce() {
		return prix * quantité; 
	}

	public Pièce(int réf, String nom, int quantité, double prix) {
		this.réf = réf;
		this.nom=nom;
		this.quantité = quantité;		
		this.prix = prix;
		quantitéStock++;
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
    public void setConstructeur (String constructeur) {
      this.constructeur = constructeur;
    }
    public String getConstructeur () {
        return constructeur;
    }
}
