package TP5;

import java.util.Date;

public class Atelier {
	private int numAtelier;
	private Date entrée; 
	private Date sortie;
	
	public Date getEntrée() {
		return entrée;
	}
	public void setEntrée(Date entrée) {
		this.entrée = entrée;
	}
	public int getNumAtelier() {
		return numAtelier;
	}
	public void setNumAtelier(int numAtelier) {
		this.numAtelier = numAtelier;
	}
	public Date getSortie() {
		return sortie;
	}
	public void setSortie(Date sortie) {
		this.sortie = sortie;
	} 
	
	Atelier(int numAtelier ,Date entrée, Date  sortie){
		this.numAtelier = numAtelier;
		this.entrée = entrée;
		this.sortie = sortie;
	}
	
}