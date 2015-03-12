package com.modele;

import java.util.List;

public class Oeuf implements Statut {

	final static int VITESSE_MAX = 0;
	
	private Oiseau oiseau;


	public Oeuf(Oiseau pOiseau) {
		this.oiseau = pOiseau;
	}

	public Oiseau getOiseau() {
		return oiseau;
	}

	public void setOiseau(Oiseau oiseau) {
		this.oiseau = oiseau;
	}


	public boolean isReproductionOK(Animal a) {

		return false;
	}

	public List<Animal> seReproduire(Animal a) {

		return null;
	}

	// Méthode permettant de gérer l'éclosion
	public void grandir(boolean vivre) {
		if (vivre) {
			oiseau.setStatut(new Poussin(oiseau));
		} else {
			oiseau.setStatut(new Mort(oiseau));
		}
	}

}
