package TP3;

public class Personne {
    private String nom;
    private String prenom;
    private String email;
    private String login;
    private String password;

    // Constructeur sans arguments
    public Personne() {
        this.nom = "inconnu";
        this.prenom = "inconnu";
        this.email = "inconnu";
        this.login = "inconnu";
        this.password = "inconnu";
    }

    // Constructeur avec tous les attributs
    public Personne(String nom, String prenom, String email, String login, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Nom :" + this.nom + "\n Prénom :" + this.prenom + "\nemail :" + this.email;
    }

    public void afficher() {
        System.out.println("Voici les informations du client :\n " + this.toString());
    }

    public boolean sauthentifier1(String login) {
        // 1er essai de connexion
        return login.equals(this.password);
    }
    
    public boolean sauthentifier2(String login) {
        // 3 essais de connexion
        int remainingAttempts = 2; // Nombre d'essais restants après le 1er essai
    
        while (remainingAttempts > 0) {
            if (login.equals(this.password)) {
                return true;
            } else {
                remainingAttempts--;
            }
        }
        return false;
    }
    
}
