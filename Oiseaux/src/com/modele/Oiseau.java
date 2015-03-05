package com.modele;

public class Oiseau extends Animal {

	final static double DUREE_DE_VIE_MAX = 20;
	final static double DUREE_DE_VIE_MIN = 0;

	@Override
	void deplacement() {
	}

	@Override
	double calculDureeDeVie() {

		dureeDeVie = (double) (Math.random() * (DUREE_DE_VIE_MAX - DUREE_DE_VIE_MIN))
				+ DUREE_DE_VIE_MIN;

		return dureeDeVie;
	}

	@Override
	boolean seReproduire(Animal a) {
		return ((this.isReproductible()) && (a.isReproductible()));

	}
}
