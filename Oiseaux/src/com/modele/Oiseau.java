package com.modele;

import com.testExemple.Statut;

public class Oiseau extends Animal{
	
	final static double DUREE_DE_VIE_MAX = 20;
	final static double DUREE_DE_VIE_MIN = 0;
	
	Statut statut;
		

	@Override
	void deplacement() {			
	}

	@Override
	double calculDureeDeVie() {
	
		dureeDeVie = (double) (Math.random()*(DUREE_DE_VIE_MAX-DUREE_DE_VIE_MIN)) + DUREE_DE_VIE_MIN;
		
		return dureeDeVie;
	}

}
