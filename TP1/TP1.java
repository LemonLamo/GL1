package TP1;
import java.util.Scanner;

public class TP1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anneeNaissance;
        do {
            System.out.print("Entrez votre année de naissance : ");
            anneeNaissance = scanner.nextInt();

            if (anneeNaissance <= 0) {
                System.out.println("Veuillez entrer une année de naissance valide.");
            }

        } while (anneeNaissance <= 0);

        int age = calculerAge(anneeNaissance);
        System.out.println("Bravo! Vous avez " + age + " ans.");

        System.out.print("Entrez la valeur de x : ");
        int x = scanner.nextInt();

        System.out.print("Entrez la valeur de y : ");
        int y = scanner.nextInt();

        comparerXetY(x, y);

        sommeEtMoyenne(scanner);

        scanner.close();
    }

    public static int calculerAge(int anneeNaissance) {
        return java.time.Year.now().getValue() - anneeNaissance;
    }

    public static void comparerXetY(int x, int y) {
        if (x > y) {
            System.out.println("x est plus grand que y.");
        } else if (x < y) {
            System.out.println("x est plus petit que y.");
        } else {
            System.out.println("x est égal à y.");
        }
    }

    public static void sommeEtMoyenne(Scanner scanner) {
        int nombre;
        int somme = 0;
        int count = 0;

        do {
            System.out.print("Entrez un nombre positif (ou -1 pour terminer) : ");
            nombre = scanner.nextInt();

            if (nombre >= 0) {
                somme += nombre;
                count++;
            } else if (nombre != -1) {
                System.out.println("Veuillez entrer un nombre positif.");
            }

        } while (nombre != -1);

        if (count > 0) {
            double moyenne = (double) somme / count;
            System.out.println("La somme des nombres est : " + somme);
            System.out.println("La moyenne des nombres est : " + moyenne);
        } else {
            System.out.println("Aucun nombre positif saisi.");
        }
    }
}
