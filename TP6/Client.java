package TP6;

public class Client {
    private int numero;
    private String nom;
    private String adresse;
    private String tel;

    // Constructeur par défaut
    public Client() {
    }

    // Constructeur avec paramètres
    public Client(int numero, String nom, String adresse, String tel) {
        this.numero = numero;
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTel() {
        return tel;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Client{" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    // Méthode afficher
    public void afficher() {
        System.out.println("Numéro : " + numero);
        System.out.println("Nom : " + nom);
        System.out.println("Adresse : " + adresse);
        System.out.println("Téléphone : " + tel);
    }
}
