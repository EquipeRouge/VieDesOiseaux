package com.modele;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ressources.*;

public class Oiseau extends Animal {

	private static final int MAX_OEUFS = 5;

	Statut statut;
	List<Animal> oeufs;

	{ // commun aux constructeurs
		this.sexe = this.setSexe();
		this.dureeDeVie = this.calculDureeDeVie();
		this.age = 0;
		this.statut = new Oeuf(this);
	}

	// Constructeur
	public Oiseau() {

		this.parents = Parents.addParents(null, null);
	}

	public Oiseau(Oiseau pere, Oiseau mere) {

		this.parents = Parents.addParents(pere, mere);
	}

	public void showStatut() {
		System.out.println(this.statut);
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public int getMaxOeufs() {
		return MAX_OEUFS;
	}

	public void grandir(boolean vivre) {
		statut.grandir(vivre);
	}

	// Voir avec équipe déplacement
	// public void deplacer(){
	// statut.deplacer();
	// }
	void deplacement() {
		super.deplacement();
	}

	// En attente création méthode isInceste pour finaliser
	boolean isReproductionOK(Animal a) {
		if (this.sexe == a.sexe)
			return false;
		// if ( ! this.isInceste(a) ) return false;
		if (!this.isReproductible)
			return false;
		if (!(a.isReproductible))
			return false;
		return true;
	}

	// @Override
	// protected Animal pondre(Animal a)
	// {
	// return new Oiseau(this,(Oiseau)a);
	// }

	protected List<Animal> seReproduire(Animal a) {
		if (!isReproductionOK(a)) {
			throw new IllegalArgumentException("je peux pas dsl");
		}

		Random generateur = new Random();
		int rand = generateur.nextInt(MAX_OEUFS);
		for (int i = 0; i < rand; i++) {
			// enfants.add(pondre(a));
			oeufs.add(new Oiseau(this, (Oiseau) a));
		}
		return oeufs;
	}

	public void faireEvoluer() {
		while (this.age < this.dureeDeVie) {

			switch (this.age) {
			case 0:
				this.grandir(true);
				break;
			case 2:
				this.grandir(true);
				break;
			case 4:
				this.grandir(true);
				break;
			case 20:
				this.grandir(true);
				break;
			default:
				this.grandir(false);
			}

			// if(this.age==2){
			// papa.grandir(true);
			// }else if(age==4){
			// papa.grandir(true);
			//
			// }

			this.showStatut();
			age++;
		} // while
		this.grandir(false);
		this.showStatut();
	} // void
}
