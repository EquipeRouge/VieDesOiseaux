package com.modele;

public class Oeuf extends Oiseau implements Statut {

	public Oeuf() {
		// TODO Stub du constructeur généré automatiquement
	}

	public void deplacement() {
		super.deplacement();
		this.vitesse = VITESSE_MIN;
		
	}

	public boolean seReproduire(Animal a) {
		return false;
	}

	

}
