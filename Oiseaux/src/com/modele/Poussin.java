package com.modele;

import java.util.ArrayList;
import java.util.List;

public class Poussin implements Statut {
	final static int VITESSE_MOY = 2;
	Oiseau oiseau;

	public Poussin(Oiseau pOiseau) {
		this.oiseau = pOiseau;
	}


	public boolean isReproductionOK(Animal a) {

		return false;
	}

	public ArrayList<Oiseau> seReproduire(Oiseau a) {

		return new ArrayList<Oiseau>();
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
