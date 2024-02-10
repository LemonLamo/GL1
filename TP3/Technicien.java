package TP3;

public class Technicien extends Personne {
    private int matricule;
    private Specialite specialite;

    // Enumération pour la spécialité
 

    // Constructeur sans arguments
    public Technicien() {
        super();
        this.matricule = 0;
        this.specialite = null;
    }

    // Constructeur avec arguments
    public Technicien(String nom, String prenom, String email, String login, String password, int matricule, Specialite specialite) {
        super(nom, prenom, email, login, password);
        this.matricule = matricule;
        this.specialite = specialite;
    }

    // Getters
    public int getMatricule() {
        return matricule;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    // Setters
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatricule: " + matricule + "\nSpécialité: " + specialite;
    }

    @Override
    public void afficher() {
        System.out.println("Voici les informations du technicien :\n" + this.toString());
    }
}

