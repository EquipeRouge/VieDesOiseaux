package com.modele;

import java.util.List;

public class Oeuf implements Statut {

	final static int VITESSE_MAX = 0;
	Oiseau oiseau;

	public Oeuf(Oiseau pOiseau) {
		this.oiseau = pOiseau;
	}

	public void deplacement() {
		deplacement();
	}
	
	public boolean isReproductionOK(Animal a) {
		// TODO Stub de la méthode généré automatiquement
		return false;
	}

	public List<Animal> seReproduire(Animal a) {
		// TODO Stub de la méthode généré automatiquement
		return null;
	}

	//Méthode permettant de gérer l'éclosion
	public void grandir(boolean vivre) {
		if (vivre){
		oiseau.setStatut(new Poussin(oiseau));
		}else{
			oiseau.setStatut(new Mort(oiseau));
		}
	}

	// Test sur le satut
	 public String toString(){
	 return "oeuf";
	 }

}
