package TP3;
import java.util.Date;

public class Programme {

    public static void main(String[] args) {
        // Exemple d'utilisation des classes

        // Création d'une personne
        Personne personne = new Personne("Koucem", "Lamia", "lamooooo@example.com", "Lamooo", "fakepassword123");

        // Affichage des informations de la personne
        personne.afficher();

        // Création d'un technicien
        Technicien technicien = new Technicien("Naoui", "Khaled", "LazySkelly@example.com", "tiredlich", "pass123", 123, Specialite.INFORMATIQUE);

        // Affichage des informations du technicien
        technicien.afficher();

        // Mise à jour de l'expérience du chef d'atelier
        Chef_atelier chefAtelier = new Chef_atelier("HadjSadok", "Riadh", "RiadhHS99@example.com", "RiadhHS", "securepass123", 1, new Date(), null, Statue.ACTIF);
        chefAtelier.afficher();

        // Simulation de la mise à jour de l'expérience avec une nouvelle date
        chefAtelier.miseAjourDateRecrutement();;

        // Affichage des nouvelles informations du chef d'atelier
        chefAtelier.afficher();
    }
}
