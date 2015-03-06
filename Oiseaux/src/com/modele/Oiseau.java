package com.modele;

public class Oiseau extends Animal {

	final static double DUREE_DE_VIE_MAX = 20;
	final static double DUREE_DE_VIE_MIN = 0;

	final static int HIGHER = 100;
	final static int LOWER = 0;
	
	
	Statut statut;
		

	void deplacement() {

		
		this.coordoneeX = (int)(Math.random() * (HIGHER-LOWER)) + LOWER;
		this.coordoneeY = (int)(Math.random() * (HIGHER-LOWER)) + LOWER;
		this.newCoordonneeX = (int)(Math.random() * (HIGHER-LOWER)) + LOWER;
		this.newCoordonneeY = (int)(Math.random() * (HIGHER-LOWER)) + LOWER;
		this.vitesse = 1;
		
	}


	double calculDureeDeVie() {


		dureeDeVie = (double) (Math.random() * (DUREE_DE_VIE_MAX - DUREE_DE_VIE_MIN))
				+ DUREE_DE_VIE_MIN;
	
		dureeDeVie = (double) (Math.random()*(DUREE_DE_VIE_MAX-DUREE_DE_VIE_MIN)) + DUREE_DE_VIE_MIN;
		return dureeDeVie;
	}

//	boolean seReproduire(Animal a) {
//		return ((this.isReproductible()) && (a.isReproductible()));
//
//	}
}
