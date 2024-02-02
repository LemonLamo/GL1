package TP2;
public class Tp2exo1 {
    public static void main(String args[]){
     //1. déclarer et construire un Polynome p1 avec les valeurs par défaut;
     Polynome p1 = new Polynome();
     //2. donner la valeur 1 à tous les coefficients de p1 ;
     p1.setA(1);
     p1.setB(1);
     p1.setC(1);
     //3. déclarer et construire un Polynôme p2 avec les valeurs 1, -2, -3 ;
     Polynome p2 = new Polynome(1, -2, -3);
     //4. afficher p1 puis p2 ;
     System.out.println("Polynome p1 : " + p1.toString());
     System.out.println("Polynome p2 : " + p2.toString());
     //ou bien directement la methode afficher 

     //5. afficher la valeur de p2 pour l'entier 2 ;
     System.out.println("Valeur de p2 pour l'entier 2 : " + p2.evaluer(2));
     //6. afficher la valeur de la dérivée p2 pour l'entier 2 ;
     System.out.println("Valeur de la dérivée de p2 pour l'entier 2 : " + p2.evaluerDerive(2));
     //7. déclarer un polynôme p3 et l'initialiser à la dérivée de p2;
     Polynome p3 = p2.derive();
     //8. afficher p3 ;
     System.out.println("Polynome p3 (Dérivée de p2) : " + p3.toString());
     //9. afficher le discriminant de p2 ;
     System.out.println("Discriminant de p2 : " + p2.discriminant());
     //10. afficher les racines de p2 ;
     System.out.print("Racines de p2 : ");
     p2.afficherRacines();
     //11. afficher le discriminant de p1 ;
     System.out.println("Discriminant de p1 : " + p1.discriminant());
     //12. afficher les racines de p1 ;
     System.out.print("Racines de p1 : ");
     p1.afficherRacines();
     //13. ajouter p2 à p1 puis afficher p1 ;
     p1 = p1.somme(p2);
     System.out.println("Polynome p1 après addition avec p2 : " + p1.toString());
     //14. mettre à zéro le coefficient de degré 2 de p1 ;
     p1.setA(0);
     //15. mettre à zéro les coefficients de degré 2 et 1 de p3 ;
     p3.setB(0);
     p3.setC(0);
    }
}

    
