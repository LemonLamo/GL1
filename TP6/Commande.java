package TP6;

public class Commande {
    private int dateCde;
    private int quantiteCde;

    // Constructeur avec paramètres
    public Commande(int dateCde, int quantiteCde) {
        this.dateCde = dateCde;
        this.quantiteCde = quantiteCde;
    }

    // Setters
    public void setDateCde(int dateCde) {
        this.dateCde = dateCde;
    }

    public void setQuantiteCde(int quantiteCde) {
        this.quantiteCde = quantiteCde;
    }

    // Getters
    public int getDateCde() {
        return dateCde;
    }

    public int getQuantiteCde() {
        return quantiteCde;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Commande{" +
                "dateCde=" + dateCde +
                ", quantiteCde=" + quantiteCde +
                '}';
    }

    // Méthode afficher
    public void afficher() {
        System.out.println("Date de commande : " + dateCde);
        System.out.println("Quantité commandée : " + quantiteCde);
    }
}
