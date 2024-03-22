package TP6;

public class Produit {
    private int codeBarre;
    private String designation;
    private int quantite;
    private double prix;
    private Categorie categorie;

    // Constructeur par défaut
    public Produit() {
    }

    // Constructeur avec paramètres
    public Produit(int codeBarre, String designation, int quantite, double prix, Categorie categorie) {
        this.codeBarre = codeBarre;
        this.designation = designation;
        this.quantite = quantite;
        this.prix = prix;
        this.categorie = categorie;
    }

    // Setters
    public void setCodeBarre(int codeBarre) {
        this.codeBarre = codeBarre;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    // Getters
    public int getCodeBarre() {
        return codeBarre;
    }

    public String getDesignation() {
        return designation;
    }

    public int getQuantite() {
        return quantite;
    }

    public double getPrix() {
        return prix;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Produit{" +
                "codeBarre=" + codeBarre +
                ", designation='" + designation + '\'' +
                ", quantite=" + quantite +
                ", prix=" + prix +
                ", categorie=" + categorie +
                '}';
    }

    // Méthode afficher
    public void afficher() {
        System.out.println("Code Barre : " + codeBarre);
        System.out.println("Désignation : " + designation);
        System.out.println("Quantité : " + quantite);
        System.out.println("Prix : " + prix);
        System.out.println("Catégorie : " + categorie);
    }
}

