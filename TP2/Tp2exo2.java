package TP2;

public class Tp2exo2 {
    public static void main(String[] args) {
        // Création d'un objet Client avec le constructeur
        Client client1 = new Client(1, "Koucem", "Lamia", "El biar the best", "0799XXXXXX");
        
        // Affichage des informations du client à l'aide de la méthode afficher()
        System.out.println("\nInformations du client : ");
        client1.afficher();

        // Création d'un objet Client avec le constructeur sans argument
        Client client2 = new Client();
        
        // Test des méthodes getters
        System.out.println("\nTest des getters : ");
        System.out.println("Numéro du client : " + client1.getNumero());
        System.out.println("Nom du client : " + client1.getNom());
        System.out.println("Prénom du client : " + client1.getPrenom());
        System.out.println("Adresse du client : " + client1.getAdresse());
        System.out.println("Téléphone du client : " + client1.getTel());

        // Test des méthodes setters
        System.out.println("\nTest des setters : ");
        client2.setNumero(2);
        client2.setNom("Hadj Sadok");
        client2.setPrenom("Riadh");
        client2.setAdresse("Alger");
        client2.setTel("0770XXXXXX");
        // Affichage des nouvelles informations du client
        System.out.println("\nInformations mises à jour du client : ");
        client2.afficher();
    }
}

