package com.modele;

public class Mort extends Oiseau implements Statut{

	public Mort() {
		// TODO Stub du constructeur généré automatiquement
	}

	public void deplacement() {
		super.deplacement();
		this.vitesse = VITESSE_MIN;
		
	}

	public boolean seReproduire(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
