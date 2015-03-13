package com.modele;

import java.util.ArrayList;
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

	public ArrayList<Oiseau> seReproduire(Oiseau a) {

		return new ArrayList<Oiseau>();
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
