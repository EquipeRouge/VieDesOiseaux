package com.modele;
import com.ressources.*;

import java.util.ArrayList;
import java.util.List;

import com.ressources.Famille;
import com.ressources.PointDeplaceable;

public class Oiseau extends Animal {

	private static final int MAX_OEUFS = 5;
	final static int VITESSE_MIN = 0;
	final static int VITESSE_MOY = 1;
	final static int VITESSE_MAX = 3;

	Statut statut;

	{ // commun aux constructeurs
		this.age = 0;
		this.dureeDeVie = this.calculDureeDeVie();

		this.sexe = this.setSexe();
		this.statut = new Oeuf(this);
		
		sonCorps = new PointDeplaceable(xInit, yInit, xFinal, yFinal);
	}

	// Constructeurs
	public Oiseau() {
		this.famille = new Famille();
	} // constructeur

	public Oiseau(Famille pere, Famille mere) {
		this.famille = new Famille(this, pere, mere);
	} // constructeur


	public void showStatut() {
		System.out.println(this.statut);
	} // void

	public Sexe getSex() {
		return sexe;
	} // Sexe

	public Famille getFamille() {
		return this.famille;
	} // Famille
	
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

	public void definirVitesse(){
		if((this.statut instanceof Oeuf) || (this.statut instanceof Mort)){
			this.sonCorps.vitesse = VITESSE_MIN;
		}
		else if (this.statut instanceof Poussin){
			this.sonCorps.vitesse = VITESSE_MOY;
		}
		else{
			this.sonCorps.vitesse = VITESSE_MAX;
		}
	}

	public boolean isSexeOk(final Animal unAnimal) {
		return this.sexe != unAnimal.sexe;
	}

	// En attente création méthode isInceste pour finaliser
	public boolean isReproductionOK(Animal a) {
		if (!isSexeOk(a))
			return false;
		// if ( ! this.isInceste(a) ) return false;
		if (!this.isReproductible)
			return false;
		if (!(a.isReproductible))
			return false;
		return true;
	}

	public ArrayList<Oiseau> seReproduire(Oiseau a) {

		return statut.seReproduire(a);
	}

//	public void faireEvoluer() {
//		while (this.age < this.dureeDeVie) {
//
//			switch (this.age) {
//			case 30:
//				this.grandir(true);
//				break;
//			case 120:
//				this.grandir(true);
//				break;
//			case 180:
//				this.grandir(true);
//				break;
//			}
//			this.showStatut();
//			age++;
//		}
//		this.grandir(false);
//		this.showStatut();
//	}
	
	public void faireEvoluer() {
		if (this.age < this.dureeDeVie) {

			if(this.age == 40) 
				this.grandir(true);
			if(this.age == 120)
				this.grandir(true);
			if(this.age == 180)
				this.grandir(true);
			this.showStatut();
			age++;
		}
		else{
			this.grandir(false);
			this.showStatut();
		}
}
	
	
}
