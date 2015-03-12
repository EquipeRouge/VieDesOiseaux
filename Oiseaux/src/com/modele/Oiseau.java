package com.modele;

import java.util.List;

import com.ressources.Famille;

public class Oiseau extends Animal {

	private static final int MAX_OEUFS = 5;
	static final int VITESSE_MIN = 5;

	Statut statut;

	Sexe getSex() {
		return sexe;
	}

	{ // commun aux constructeurs
		this.sexe = this.setSexe();
		this.dureeDeVie = this.calculDureeDeVie();

		this.age = 0;
		this.statut = new Oeuf(this);
	}

	// Constructeur
	public Oiseau() {
		this.famille = new Famille();
		this.statut = new Oeuf(this);

	}

	Oiseau(Oiseau pere, Oiseau mere) {

	}

	Oiseau(Famille pere, Famille mere) {
		this.sexe = this.setSexe();
		this.dureeDeVie = this.calculDureeDeVie();
		this.famille = new Famille(this, pere, mere);
		this.statut = new Oeuf(this);

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

	boolean isSexeOk(final Animal unAnimal) {
		return this.sexe != unAnimal.sexe;
	}

	// En attente création méthode isInceste pour finaliser
	boolean isReproductionOK(Animal a) {
		if (!isSexeOk(a))
			return false;
		// if ( ! this.isInceste(a) ) return false;
		if (!this.isReproductible)
			return false;
		if (!(a.isReproductible))
			return false;
		return true;
	}

	protected List<Animal> seReproduire(Animal a) {

		return statut.seReproduire(a);
	}

	public void faireEvoluer() {
		while (this.age < this.dureeDeVie) {

			switch (this.age) {
			case 2:
				this.grandir(true);
				break;
			case 4:
				this.grandir(true);
				break;
			case 20:
				this.grandir(true);
				break;
			}
			this.showStatut();
			age++;
		}
		this.grandir(false);
		this.showStatut();
	}

}
