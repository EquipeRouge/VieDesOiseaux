package com.modele;

public class Adulte extends Oiseau implements Statut{

	public Adulte() {
		// TODO Stub du constructeur généré automatiquement
	}

	public void deplacement() {
		super.deplacement();
		this.vitesse = VITESSE_MAX;
	}

	public boolean seReproduire(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
