package TP5;

import java.util.Date;
import java.util.Vector;
import java.text.DecimalFormat;
import java.util.LinkedHashSet;
public class Main {
		
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Pièce p1 = new Pièce(1, "disque de frein", "Renault", 5, 400);
		Pièce p2 = new Pièce(2, "filtre a air", "Renault", 5, 400);
		Pièce p3 = new Pièce(3, "filtre a huile", "Renault", 6, 500.0282);
		Pièce p4 = new Pièce(4, "bougie d'allumage", "Fiat", 7, 600);
		Pièce p5 = new Pièce(5, "disque de frein", "Fiat", 8, 700);
		Pièce p6 = new Pièce(6, "plaquette de frein", "Fiat", 9, 800);
		Pièce p7 = new Pièce(7, "amortisseur", "Peugeot", 1, 900);
		Pièce p8 = new Pièce(8, "filtre a carburant", "Peugeot", 2, 1000);
		Pièce p9 = new Pièce(9, "alternateur", "Peugeot", 2, 1100);
		Pièce p10 = new Pièce(10, "démarreur", "Audi", 3, 1200);
		Pièce p11 = new Pièce(11, "radiateur", "Audi", 4, 1300);
		Pièce p12 = new Pièce(12, "thermostat", "Audi", 5, 1400);
		Pièce p13 = new Pièce(13, "courroie de distribution", "Mercedes", 6, 1500);
		Pièce p14 = new Pièce(14, "pompe a eau", "Mercedes", 7, 1600);
		Pièce p15 = new Pièce(15, "pompe a huile", "Mercedes", 8, 1700);
		Pièce p16 = new Pièce(16, "joint de culasse", "Mercedes", 9, 1800);
		
		// Date pour atelier 
		Date entrée = new Date();
		entrée.setDate(10);
		Date sortie = new Date();
		entrée.setDate(11);
		Atelier A1 = new Atelier(1001, entrée , sortie);
		
		Equipement e1 = new Equipement("Equipement e1",111, 10000);
		Equipement e2 = new Equipement("Equipement e2",222, 20000);
		Fournisseur f1 = new Fournisseur(100254, "Fournisseur f1","Adresse 1", 1057869.236);
		e1.ajouterFournisseur(f1);
		e1.setAtelier(A1);
		
		e2.ajouterFournisseur(f1);
		e2.setAtelier(A1);
		
		f1.ajouterEquipement(e1);
		f1.ajouterEquipement(e2);
		
		Technicien t1 = new Technicien( 780, Specialite.Informatique);
		Technicien t2 = new Technicien( 790, Specialite.Informatique);
		
		Vehicule v1 = new Vehicule(1025481620,"Dacia Duster");
		v1.ajouterTechnicien(t1);
		t1.setVehicule(v1);
		Vector<Technicien> equipe = new Vector<Technicien>(); 
		equipe.add(t1);
		equipe.add(t2);
		t1.setMembres(equipe);
		t2.setMembres(equipe);
		t2.designerChefDequipe(t1);
		
		Reparation r1 = new Reparation(entrée , 7 , "refaire la taule");
		r1.setListePièces(new Vector<Pièce>());

		r1.ajouterPièce(p2);
		r1.ajouterPièce(p2);
		r1.ajouterPièce(p2);

		r1.ajouterPièce(p3);
		r1.ajouterPièce(p3);
		r1.ajouterPièce(p3);
		

		r1.ajouterPièce(p4);

		r1.ajouterPièce(p5);

		r1.ajouterPièce(p6);

		r1.ajouterPièce(p7);
		

		t1.setMembres(equipe);
		t2.setMembres(equipe);

		r1.afficherListePièces();

		DecimalFormat montantFormaté = new DecimalFormat("### ###.00 DZD");
		String moneyString = montantFormaté.format(r1.calculerMontantRéparation());
		System.out.println("");
		System.out.println("Le montant de la réparation est : "+moneyString); 
		r1.supprimerPièce(p5.getRéf());
		System.out.println("");
		moneyString = montantFormaté.format(r1.calculerMontantRéparation());
		System.out.println("Le montant de la réparation avec suppresion de piece p5 est : "+moneyString); 
		System.out.println("");
		r1.ajouterPièce(p16);
		moneyString = montantFormaté.format(r1.calculerMontantRéparation());
		System.out.println("Le montant de la réparation avec ajout de piece p16 est : "+moneyString);
		System.out.println("");
		r1.setTechnicien(t1);
		System.out.println("Le Technicien chargé de réparation  son Matricule est : "+r1.getTechnicien().getMatricule());
		r1.setEquipement(e2);
		r1.setNombreHeure(80);
		r1.setEquipement(e1);
		System.out.println("");
		
		Vector<Pièce> pièceReformable = new Vector<Pièce>();
	    for(Pièce p : r1.getListePièces()) {
	    	if(r1.estRéformable(p.getRéf())) {
	    		pièceReformable.add(p);
	    	}	    	
	    }
	    //purger la listePièceReparation 
	    for(Pièce p : pièceReformable) {
	    	r1.getListePièces().removeElement(p);
	    }
        LinkedHashSet<Pièce> hashSet = new LinkedHashSet<>(pièceReformable);
        pièceReformable.clear();
        pièceReformable.addAll(hashSet);
        System.out.println("Les pièce suivantes sont reformables");	
        for(Pièce p : pièceReformable) {
        	System.out.println("Pièce Réf : "+p.getRéf()+" Nom: "+p.getNom());
        	
        	}
		System.out.println("Listes des pièces reparations NON reformable :");
        r1.afficherListePièces();
	}
	
}

