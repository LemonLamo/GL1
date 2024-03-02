package TP3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

public class Chef_atelier extends Personne {
    private int nbExperience;
    private Date dateRecrutement;
    private Date datePromotion;
    private Statue statut;
    // Constructeur sans arguments
    public Chef_atelier() {
        super(); // Appel au constructeur de la classe Personne
        this.nbExperience = 0;
        this.dateRecrutement = new Date(); // Initialise la date actuelle
        this.datePromotion = null;
        this.statut = Statue.NEANT; // Initialise le statut a neant par défaut
    }

    // Constructeur avec arguments
    public Chef_atelier(String nom, String prenom, String email, String login, String password,
     int nbExperience, Date dateExperience, Date datePromotion, Statue statut) {
        super(nom, prenom, email, login, password);
        this.nbExperience = nbExperience;
        this.dateRecrutement = dateExperience;
        this.datePromotion = datePromotion;
        this.statut = statut;
    }

    // Getters
    public int getNbExperience() {
        return nbExperience;
    }

    public Date getDateRecrutement() {
        return dateRecrutement;
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

    public void setDateRecrutement(Date dateRecrutement) {
        this.dateRecrutement = dateRecrutement;
    }

    public void setDatePromotion(Date datePromotion) {
        this.datePromotion = datePromotion;
    }

    public void setStatut(Statue statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String dateRecrutementStr = (dateRecrutement != null) ? dateFormat.format(dateRecrutement) : "N/A";
        String datePromotionStr = (datePromotion != null) ? dateFormat.format(datePromotion) : "N/A";

        return super.toString() + "\nExpérience: " + nbExperience + " ans\nDate de Recrutement: " + dateRecrutementStr
                + "\nDate de promotion: " + datePromotionStr + "\nStatut: " + statut;
    }

    @Override
    public void afficher() {
        System.out.println("Voici les informations du chef d'atelier :\n" + this.toString());
    }

    public void miseAjourDateRecrutement(Scanner scanner) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Afficher le nom, prénom et email du chef d'atelier
        System.out.println("Nom: " + getNom() + "\nPrénom: " + getPrenom() + "\nEmail: " + getEmail());

        // Demander le mot de passe du chef d'atelier
        System.out.println("Entrez le mot de passe du chef d'atelier : ");
        String passwordInput = scanner.nextLine();

        // Authentification du chef d'atelier avec sauthentifier2
        if (!sauthentifier2(passwordInput)) {
            System.out.println("Mot de passe incorrect. Mise à jour annulée.");
            return;
        }

        // Demander la nouvelle date de recrutement
        System.out.println("Entrez la nouvelle date de recrutement (format : dd/MM/yyyy) : ");
        String dateRecrutementInput = scanner.nextLine();

        try {
            Date nouvelleDateRecrutement = dateFormat.parse(dateRecrutementInput);

            // Calcul de l'expérience en années
            long diffInMillis = new Date().getTime() - nouvelleDateRecrutement.getTime();
            long diffInDays = TimeUnit.MILLISECONDS.toDays(diffInMillis);
            int experienceYears = (int) (diffInDays / 365);

            // Afficher l'expérience, la date de recrutement et la date de promotion actuelles (null)
            System.out.println("Expérience actuelle: " + nbExperience + " ans");
            System.out.println("Date de recrutement actuelle: " + dateFormat.format(dateRecrutement));
            System.out.println("Date de promotion actuelle: " + (datePromotion != null ? dateFormat.format(datePromotion) : "null"));

            // Demander si le chef d'atelier a été promu
            System.out.println("Le chef d'atelier a-t-il été promu ? (oui/non) : ");
            String promotionInput = scanner.nextLine().toLowerCase();

            if ("oui".equals(promotionInput)) {
                // Demander la nouvelle date de promotion
                System.out.println("Entrez la nouvelle date de promotion (format : dd/MM/yyyy) : ");
                String datePromotionInput = scanner.nextLine();
                Date nouvelleDatePromotion = dateFormat.parse(datePromotionInput);

                // Mise à jour de la date de promotion avec la nouvelle date
                this.datePromotion = nouvelleDatePromotion;
            } else {
                // L'utilisateur n'a pas été promu, donc la date de promotion reste null
                this.datePromotion = null;
                System.out.println("Le chef d'atelier n'a pas été promu. La date de promotion reste nulle.");
            }

            // Afficher les nouvelles informations du chef d'atelier
            System.out.println("Nouvelle expérience: " + experienceYears + " ans");
            System.out.println("Nouvelle date de recrutement : " + dateFormat.format(nouvelleDateRecrutement));
            System.out.println("Nouvelle date de promotion : " + (datePromotion != null ? dateFormat.format(datePromotion) : "null"));

        } catch (ParseException e) {
            System.out.println("Format de date incorrect. Mise à jour annulée.");
        }
    }


    }
    
 



