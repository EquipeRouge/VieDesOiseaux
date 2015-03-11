package com.modele;

import java.util.List;
import java.util.Random;

public class Adulte implements Statut {
	
	double vitesse;
	final static int VITESSE_MAX = 10;

	public Adulte() {
		// TODO Stub du constructeur généré automatiquement
	}

	public void deplacement() {
		deplacement();
		this.vitesse = VITESSE_MAX;
		
		
		
	}
	
	//En attente création méthode isInceste pour finaliser
		public boolean isReproductionOK(Animal a) {
			if ((Animal) this. == a.sexe) return false;
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

		public List<Animal> seReproduire(Animal a) {
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
