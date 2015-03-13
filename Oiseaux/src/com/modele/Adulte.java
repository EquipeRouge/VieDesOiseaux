package com.modele;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Adulte implements Statut {

	final static int VITESSE_MAX = 5;
	Oiseau oiseau;

	public Adulte(Oiseau pOiseau) {
		this.oiseau = pOiseau;
	}


	// En attente création méthode isInceste pour finaliser
	public boolean isReproductionOK(Animal a) {
//		if (this.oiseau.sexe == a.sexe)
//			return false;
//		// if ( ! this.oiseau.isInceste(a) ) return false;
//		if (!this.oiseau.isReproductible)
//			return false;
//		if (!(a.isReproductible))
//			return false;
		return true;
	}

	public ArrayList<Oiseau> seReproduire(Oiseau a) {
		if (!isReproductionOK(a)) {
			throw new IllegalArgumentException("je peux pas dsl");
		}

		Random generateur = new Random();
		ArrayList<Oiseau> oeufs = new ArrayList<Oiseau>();

		int rand = generateur.nextInt(this.oiseau.getMaxOeufs() - 1);
		rand++;
		for (int i = 0; i < rand; i++) {
			//oeufs.add(new Oiseau(this. oiseau, (Oiseau) a));
			oeufs.add(new Oiseau(oiseau.getFamille(), ((Oiseau)(a)).getFamille()));
		}
		return oeufs;
	}

	// Méthode permettant de gérer le passage à mort
	public void grandir(boolean vivre) {
		oiseau.setStatut(new Mort(oiseau));

	}

}
