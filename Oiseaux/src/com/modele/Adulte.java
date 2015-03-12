package com.modele;

import java.util.List;
import java.util.Random;

public class Adulte implements Statut {

	double vitesse;
	final static int VITESSE_MAX = 10;
	Oiseau oiseau;

	public Adulte(Oiseau pOiseau) {
		this.oiseau = pOiseau;
	}

	public void deplacement() {
		deplacement();
		this.vitesse = VITESSE_MAX;

	}

	// En attente création méthode isInceste pour finaliser
	public boolean isReproductionOK(Animal a) {
		if (this.oiseau.sexe == a.sexe)
			return false;
		// if ( ! this.oiseau.isInceste(a) ) return false;
		if (!this.oiseau.isReproductible)
			return false;
		if (!(a.isReproductible))
			return false;
		return true;
	}

	// @Override
	// protected Animal faireEnfant(Animal a)
	// {
	// return new Oiseau(this,(Oiseau)a);
	// }

	public List<Animal> seReproduire(Animal a) {
		if (!isReproductionOK(a)) {
			throw new IllegalArgumentException("je peux pas dsl");
		}

		Random generateur = new Random();
		int rand = generateur.nextInt(this.oiseau.getMaxOeufs());
		for (int i = 0; i < rand; i++) {
			// enfants.add(faireEnfant(a));
			oiseau.oeufs.add(new Oiseau(this.oiseau, (Oiseau) a));
		}
		return oiseau.oeufs;
	}

	//Méthode permettant de gérer le passage à mort
	public void grandir(boolean vivre) {
		if (vivre){
		oiseau.setStatut(new Mort(oiseau));
		}
	}	
	
	 //Test sur le satut
	 public String toString(){
	 return "adulte";
	 }

}
