package TP3;
import java.util.Scanner;



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


    public boolean sauthentifier1(Scanner scanner) {
        System.out.print("Entrez votre mot de passe : ");
        String enteredPassword = scanner.next();
        return enteredPassword.equals(this.password);
    }
    
  
    public boolean sauthentifier2(Scanner scanner) {
        int remainingAttempts = 3; // 3 essais de connexion
        
        while (remainingAttempts > 0) {
            System.out.print("Entrez votre mot de passe (tentatives restantes : " + remainingAttempts + ") : ");
            String enteredPassword = scanner.next();
    
            if (enteredPassword.equals(this.password)) {
                return true; // Authentification réussie
            } else {
                remainingAttempts--;
                System.out.println("Mot de passe incorrect. Veuillez réessayer.");
            }
        }
        
        return false; // Toutes les tentatives ont échoué
    }
    
    
    
}
