package com.modele;

public class Poussin extends Oiseau implements Statut{

	public void deplacement() {
		super.deplacement();
		this.vitesse = VITESSE_MOY;
		
	}

	public boolean seReproduire(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

}
