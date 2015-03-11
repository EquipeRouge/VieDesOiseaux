package com.modele;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ressources.*;

public class Oiseau extends Animal {

	

	private static final int MAX_ENFANT = 5;

	Statut statut;

	// Constructeur
	Oiseau() {
		this.sexe = this.setSexe();
		this.dureeDeVie = this.calculDureeDeVie();
		this.parents = Parents.addParents(null, null);
		this.statut = new Oeuf();
	}

	Oiseau(Oiseau pere, Oiseau mere) {
		this.sexe = this.setSexe();
		this.dureeDeVie = this.calculDureeDeVie();
		this.parents = Parents.addParents(pere, mere);
		this.statut = new Oeuf();
	}

	void deplacement() {
		super.deplacement();
	}
 //En attente création méthode isInceste pour finaliser
	boolean isReproductionOK(Animal a) {
		if (this.sexe == a.sexe) return false;
		if ( ! this.isInceste(a) ) return false;
		if ( ! this.isReproductible) return false;
		if ( ! (a.isReproductible) ) return false;
		return true;
	}

	// @Override
	// protected Animal faireEnfant(Animal a)
	// {
	// return new Oiseau(this,(Oiseau)a);
	// }

	protected List<Animal> seReproduire(Animal a) {
		if (!isReproductionOK(a)) {
			throw new IllegalArgumentException("je peux pas dsl");
		}

		Random generateur = new Random();
		int rand = generateur.nextInt(MAX_ENFANT);
		for (int i = 0; i < rand; i++) {
			// enfants.add(faireEnfant(a));
			enfants.add(new Oiseau(this, (Oiseau) a));
		}
		return enfants;

	}

}
