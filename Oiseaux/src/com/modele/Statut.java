package com.modele;

public abstract class Statut {
	String nom;
	
	public Statut(String n) {
		nom = n;
	}


	public abstract void afficherStatut();
		
	
}