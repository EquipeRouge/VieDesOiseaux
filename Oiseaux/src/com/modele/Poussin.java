package com.modele;

import java.util.List;

public class Poussin implements Statut {
	final static int VITESSE_MOY = 5;
	double vitesse;
	Oiseau oiseau;

	public Poussin(Oiseau pOiseau) {
		this.oiseau = pOiseau;
	}

	public void deplacement() {
		deplacement();
		this.vitesse = VITESSE_MOY;

	}

	public boolean isReproductionOK(Animal a) {

		return false;
	}

	public List<Animal> seReproduire(Animal a) {

		return null;
	}

	// Méthode permettant de gérer le passage à l'état adulte donc reproductible
	public void grandir(boolean vivre) {
		if (vivre) {
			oiseau.setStatut(new Adulte(oiseau));
			oiseau.isReproductible = true;
		} else {
			oiseau.isReproductible = false;
			oiseau.setStatut(new Mort(oiseau));
		}
	}

}
