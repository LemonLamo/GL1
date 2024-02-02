package TP2;

public class Client {
    private int numero;
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    public Client (int numero, String nom, String prenom, String adresse, String tel) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse= adresse;
        this.tel=tel;
    }
     // Constructeur sans argument
     public Client() {
        this.numero = 0;
        this.nom = "";
        this.prenom = "";
        this.adresse = "";
        this.tel = "";
    }
    //getters and setters 
     // Getters
     public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTel() {
        return tel;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public String toString() {
        return "[Le client N° " + numero + " est : " + prenom + " " + nom +
               " habitant " + adresse + " et son téléphone est " + tel + "]";
    }
    public void afficher() {
        System.out.println(toString());
    }
}

