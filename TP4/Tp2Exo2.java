package TP4;

import java.util.BitSet;
import java.util.Date;
import java.util.Vector;
import java.util.Calendar;
public class Tp2Exo2 {
    public static void main(String[] args) {
    	Vector<Pièce> listePièceRep = new Vector<>();
    	Date aujourdhui = new Date();
    	
        Pièce p1 = new Pièce(1, "retroviseur", 2, 1000); 
        Pièce p2 = new Pièce(2, "pneu", 4, 1200); 
        Pièce p3 = new Pièce(3, "volant", 1, 1400); 
        Pièce p4 = new Pièce(4, "plaque de frein", 1, 1600); 
        Pièce p5 = new Pièce(5, "siege", 2, 1800); //c'est totalement aleatoire
        
        
        listePièceRep.add(p1);
        listePièceRep.add(p2);
        listePièceRep.add(p3);
        listePièceRep.add(p4);
        listePièceRep.add(p5);
        
        // Créer un Objet Réparation 
        Réparation r1 = new Réparation();
        
        r1.setListePièces(listePièceRep);
        r1.setDateRep(aujourdhui);
        r1.setNbHeure(80);
        r1.setTravaux("Rénovation du Véhicule");
        
        // Afficher l'objet Réparation 
        r1.afficherListePièces();
        
        // Ajouter une Pièce 
        System.out.println("Ajouter une pièce \n");
        Pièce p6 = new Pièce(6, "phare gauche", 5, 800);
        r1.ajouterPièce(p6);
        r1.afficherListePièces();
        
        // Supprimer une pièce 
        
        r1.supprimerPièce(2);
        r1.afficherListePièces();
        
        // Modifier une pièce en utilisant les attributs 
        
        r1.modifierPièce(6, "phare droit", 4, 800);
        r1.afficherListePièces();
        
        // Modifier une pièce en utilisant un Objet pièce 
        p6.setNom("phare gauche");
        p6.setQuantité(5);
        r1.modifierPièce(p6);
        r1.afficherListePièces();
        
        //Calculer le prix d'une réparation 
        
        Equipement maVoiture = new Equipement();
        
        maVoiture.setListePiècesEquipement(listePièceRep);
        int nbPièceDefectueuse = listePièceRep.size();
        BitSet pièceDefectueuse = new BitSet(nbPièceDefectueuse);
     // mettre quelques pièce a 1 pour indiquer qu'elles sont defectueuses 
        for (int i = 0; i < nbPièceDefectueuse; i += 2) {
        	pièceDefectueuse.set(i);
        }
        maVoiture.setPièceDefectueuse(pièceDefectueuse);
      
        System.out.println("Nombre de pièces defectueuses a réparer : "+maVoiture.compterPiecesDefectueuse());
        System.out.println("Prix de la réparation : "+r1.calculerPrixRep(maVoiture));
        
        //***************** Test planning de maintenance ********************// 
        Date dateDeMaintenance [] = new Date[7];
        Calendar calendar = Calendar.getInstance();

        // faire un planning de 7 jours 
        
        for (int i = 0; i < 7; i++) {
        	dateDeMaintenance[i] = calendar.getTime();
            
            System.out.println(dateDeMaintenance[i]);
            
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        
        int nbHeures [] = {8,8,8,8,8,5,5};
        String [] travaux = {"Maintenance du 03/03/2024","Maintenance du 04/03/2024","Maintenance du 05/03/2024","Maintenance du 06/03/2024","Maintenance du 07/03/2024","Maintenance du 08/03/2024","Maintenance du 09/03/2024"};
        Planning p = new Planning(1,dateDeMaintenance,nbHeures, travaux,listePièceRep);
        p.afficherListeMaint();
        // modifier une maintenance 
        p.modifierMaint(dateDeMaintenance[0], 0, "Maintenance Annulée");
        p.afficherListeMaint();
        // supprimer une maintenance 
        p.supprimerMaint(dateDeMaintenance[0]);
        p.afficherListeMaint();
        // ajouter une maintenance 
        p.ajouterMaint(aujourdhui, nbPièceDefectueuse, "Maintenance Nécessaire", listePièceRep);
        p.afficherListeMaint();
    }
}