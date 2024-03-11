package TP5;

import java.util.Vector;

public class Fournisseur {
	
	private int numRC;
	private String raisonSocial;
	private String adresse;
	private double capital;
	private Vector<Equipement> equipements = new Vector<Equipement>();
	public int getNumRC() {
		return numRC;
	}
	public void setNumRC(int numRC) {
		this.numRC = numRC;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getRaisonSocial() {
		return raisonSocial;
	}
	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	
	Fournisseur(int numRC, String raisonSocial, String adresse , double capital){
		this.numRC = numRC;
		this.raisonSocial = raisonSocial;
		this.adresse = adresse;
		this.capital = capital;	
	}
	
	public void ajouterEquipement(Equipement e) {
		if(this.numRC != e.getFournisseur().getNumRC()) {
			System.out.println("L\'équipement n\'appartient pas a ce fournisseur");
			return;
		}
		for(Equipement eq : this.equipements) {
			if(e.getNumSérie() == eq.getNumSérie()) {
				System.out.println("L\'équipement existe deja");
				return;
			}
		}
		
	}
	
	public void supprimerEquipement(Equipement e) {
		if(this.numRC != e.getFournisseur().getNumRC()) {
			System.out.println("L\'équipement n\'appartient pas a ce fournisseur");
			return;
		}
		for(int i =0; i<this.equipements.size();i++) {
			if(this.equipements.get(i).getNumSérie() == e.getNumSérie()) {
				this.equipements.remove(i);
				return;
			}
		}
		System.out.println("L\'équipement n\'existe pas");	
		
	}
	
}
