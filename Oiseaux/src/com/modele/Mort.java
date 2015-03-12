package com.modele;

import java.util.List;

public class Mort implements Statut {
	final static int VITESSE_MIN = 0;
	Oiseau oiseau;

	public Mort(Oiseau pOiseau) {
		this.oiseau = pOiseau;
		oiseau.isReproductible = false;

	}

	public void deplacement() {
	}

	public boolean isReproductionOK(Animal a) {

		return false;
	}

	public List<Animal> seReproduire(Animal a) {

		return null;
	}

	public void grandir(boolean vivre) {
		if (!vivre)
			oiseau.setStatut(new Mort(oiseau));
	}

}
