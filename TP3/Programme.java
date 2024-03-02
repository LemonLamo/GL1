package TP3;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Programme {

    public static void main(String[] args) {
        // Exemple d'utilisation des classes

        Scanner scanner = new Scanner(System.in);

        // Création d'une personne
        Personne personne = new Personne("Koucem", "Lamia", "lamooooo@example.com", "Lamooo", "fakepassword123");

        // Authentification de la personne avec sauthentifier2
        if (!personne.sauthentifier2(scanner)) {
            System.out.println("Authentification échouée. Programme terminé.");
            scanner.close();
            return;
        }

        // Affichage des informations de la personne
        personne.afficher();

        // Création d'un technicien
        Technicien technicien = new Technicien("Naoui", "Khaled", "LazySkelly@example.com", "tiredlich", "pass123", 123, Specialite.INFORMATIQUE);

        // Authentification du technicien avec sauthentifier2
        if (!technicien.sauthentifier2(scanner)) {
            System.out.println("Authentification échouée. Programme terminé.");
            scanner.close();
            return;
        }

        // Affichage des informations du technicien
        technicien.afficher();

        // Mise à jour de l'expérience du chef d'atelier
        Chef_atelier chefAtelier = new Chef_atelier("HadjSadok", "Riadh", "RiadhHS99@example.com", "RiadhHS", "securepass123", 0, new Date(), null, Statue.ACTIF);

        // Authentification du chef d'atelier avec sauthentifier2
        if (!chefAtelier.sauthentifier2(scanner)) {
            System.out.println("Authentification échouée. Programme terminé.");
            scanner.close();
            return;
        }

        // Affichage des informations actuelles du chef d'atelier (nom, prénom, email, expérience, date de recrutement, date de promotion)
        chefAtelier.afficher();

        // Simulation de la mise à jour de l'expérience avec une nouvelle date
        chefAtelier.miseAjourDateRecrutement(scanner);

        // Affichage des nouvelles informations du chef d'atelier
        chefAtelier.afficher();

        scanner.close(); // Fermer le scanner à la fin du programme
    }
}