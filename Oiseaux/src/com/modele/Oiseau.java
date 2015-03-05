package com.modele;

public class Oiseau extends Animal {

	final static double DUREE_DE_VIE_MAX = 20;
	final static double DUREE_DE_VIE_MIN = 0;
<<<<<<< HEAD
=======
	final static int HIGHER = 100;
	final static int LOWER = 0;
	
	
	Statut statut;
		
>>>>>>> refs/heads/Seb

	@Override
	void deplacement() {
<<<<<<< HEAD
=======
		
		this.coordoneeX = (int)(Math.random() * (HIGHER-LOWER)) + LOWER;
		this.coordoneeY = (int)(Math.random() * (HIGHER-LOWER)) + LOWER;
		this.newCoordonneeX = (int)(Math.random() * (HIGHER-LOWER)) + LOWER;
		this.newCoordonneeY = (int)(Math.random() * (HIGHER-LOWER)) + LOWER;
		this.vitesse = 1;
		
>>>>>>> refs/heads/Seb
	}

	@Override
	double calculDureeDeVie() {
<<<<<<< HEAD

		dureeDeVie = (double) (Math.random() * (DUREE_DE_VIE_MAX - DUREE_DE_VIE_MIN))
				+ DUREE_DE_VIE_MIN;

=======
	
		dureeDeVie = (double) (Math.random()*(DUREE_DE_VIE_MAX-DUREE_DE_VIE_MIN)) + DUREE_DE_VIE_MIN;
>>>>>>> refs/heads/Seb
		return dureeDeVie;
	}

	@Override
	boolean seReproduire(Animal a) {
		return ((this.isReproductible()) && (a.isReproductible()));

	}
}
