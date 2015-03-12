package com.modele;

import java.util.List;

public class Mort implements Statut {
	final static int VITESSE_MIN = 0;
	Oiseau oiseau;

	public Mort(Oiseau pOiseau) {
		this.oiseau = pOiseau;
	}

	// public boolean isReproductionOK(Animal a) {
	// return false;
	// }

	public void deplacement() {
	}

	public boolean isReproductionOK(Animal a) {
		// TODO Stub de la méthode généré automatiquement
		return false;
	}

	public List<Animal> seReproduire(Animal a) {
		// TODO Stub de la méthode généré automatiquement
		return null;
	}

	public void grandir(boolean vivre) {
	}
	// Test sur le satut
	 public String toString(){
	 return "mort";
	 }

}
