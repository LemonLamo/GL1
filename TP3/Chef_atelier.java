package TP3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Chef_atelier extends Personne {
    private int nbExperience;
    private Date dateExperience;
    private Date datePromotion;
    private Statue statut;
    // Constructeur sans arguments
    public Chef_atelier() {
        super(); // Appel au constructeur de la classe Personne
        this.nbExperience = 0;
        this.dateExperience = new Date(); // Initialise la date actuelle
        this.datePromotion = null;
        this.statut = Statue.NEANT; // Initialise le statut a neant par défaut
    }

    // Constructeur avec arguments
    public Chef_atelier(String nom, String prenom, String email, String login, String password,
     int nbExperience, Date dateExperience, Date datePromotion, Statue statut) {
        super(nom, prenom, email, login, password);
        this.nbExperience = nbExperience;
        this.dateExperience = dateExperience;
        this.datePromotion = datePromotion;
        this.statut = statut;
    }

    // Getters
    public int getNbExperience() {
        return nbExperience;
    }

    public Date getDateExperience() {
        return dateExperience;
    }

    public Date getDatePromotion() {
        return datePromotion;
    }

    public Statue getStatut() {
        return statut;
    }

    // Setters
    public void setNbExperience(int nbExperience) {
        this.nbExperience = nbExperience;
    }

    public void setDateExperience(Date dateExperience) {
        this.dateExperience = dateExperience;
    }

    public void setDatePromotion(Date datePromotion) {
        this.datePromotion = datePromotion;
    }

    public void setStatut(Statue statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return super.toString() + "\nExpérience: " + nbExperience + " ans\nDate d'expérience: " + dateExperience
                + "\nDate de promotion: " + datePromotion + "\nStatut: " + statut;
    }

    @Override
    public void afficher() {
        System.out.println("Voici les informations du chef d'atelier :\n" + this.toString());
    }

    public void miseAjourExperienceFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la nouvelle date d'expérience (format : dd/MM/yyyy) : ");
        String userInput = scanner.nextLine();
    
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date nouvelleDateExp = dateFormat.parse(userInput);
    
            // Mise à jour de la date d'expérience avec la nouvelle date
            this.dateExperience = nouvelleDateExp;
    
            // Affichage de la nouvelle date d'expérience
            System.out.println("Nouvelle date d'expérience : " + dateFormat.format(this.dateExperience));
    
        } catch (ParseException e) {
            System.out.println("Format de date incorrect. Utilisez le format dd/MM/yyyy.");
        } finally {
            scanner.close(); // Fermer le scanner à la fin de la méthode
        }
    }
    
 
    
    
}


