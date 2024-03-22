package TP6;

public class LigneFacture {
    private int numLigne;
    private int quantiteLigne;
    private double montantLigne;
    private Produit produit;

    // Constructeur par défaut
    public LigneFacture() {
    }

    // Constructeur avec paramètres
    public LigneFacture(int numLigne, int quantiteLigne, Produit produit) {
        this.numLigne = numLigne;
        this.quantiteLigne = quantiteLigne;
        this.produit = produit;
        this.montantLigne = calculerMontantLigne();
    }

    // Setters
    public void setNumLigne(int numLigne) {
        this.numLigne = numLigne;
    }

    public void setQuantiteLigne(int quantiteLigne) {
        this.quantiteLigne = quantiteLigne;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
        this.montantLigne = calculerMontantLigne();
    }

    // Getters
    public int getNumLigne() {
        return numLigne;
    }

    public int getQuantiteLigne() {
        return quantiteLigne;
    }

    public Produit getProduit() {
        return produit;
    }

    // Méthode pour obtenir la désignation du produit
    public String getDesignation() {
        if (produit != null) {
            return produit.getDesignation();
        }
        return null;
    }

    // Méthode pour calculer le montant de la ligne
    public double calculerMontantLigne() {
        if (produit != null) {
            return quantiteLigne * produit.getPrix();
        }
        return 0.0;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "LigneFacture{" +
                "numLigne=" + numLigne +
                ", quantiteLigne=" + quantiteLigne +
                ", montantLigne=" + montantLigne +
                ", produit=" + produit +
                '}';
    }

    // Méthode afficher
    public void afficher() {
        System.out.println("Numéro de ligne : " + numLigne);
        System.out.println("Quantité : " + quantiteLigne);
        System.out.println("Montant : " + montantLigne);
        if (produit != null) {
            System.out.println("Produit : " + produit.getDesignation());
        }
    }
}
