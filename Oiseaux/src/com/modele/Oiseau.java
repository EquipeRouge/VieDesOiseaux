package com.modele;
import com.ressources.*;

import java.util.ArrayList;
import java.util.List;

import com.ressources.PointDeplaceable;

public class Oiseau extends Animal {

	private static final int MAX_OEUFS = 5;
	final static int VITESSE_MIN = 0;
	final static int VITESSE_MOY = 1;
	final static int VITESSE_MAX = 3;
	
	final static int RANG_FAMILLE = 5;

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

	public Sexe getSexe() {
		return sexe;
	} // Sexe
	public void setSexe(Sexe pSexe) {
		this.sexe= pSexe;
	} // void
	
	public Famille getFamille() {
		return this.famille;
	} // Famille
	
	public Statut getStatut() {
		return statut;
	} // Statut

	public void setStatut(Statut statut) {
		this.statut = statut;
	} // void

	public int getRangFamille() {
		return RANG_FAMILLE;
	} // int
	
	public int getMaxOeufs() {
		return MAX_OEUFS;
	} // int

	public void grandir(boolean vivre) {
		statut.grandir(vivre);
	} // void

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
	} // void

	public boolean isSexeOk(final Animal unAnimal) {
		return this.sexe != unAnimal.sexe;
	} // boolean

	
	public ArrayList<Oiseau> seReproduire(Oiseau a) {

		return statut.seReproduire(a);
	} // ArrayList<Oiseau>
	
	public void faireEvoluer() {
		if (this.age < this.dureeDeVie) {
			
			switch(this.age){
				case 40:
				case 120:
				case 180:
					this.grandir(true);
					break;
			} // switch

			//this.showStatut();
			age++;
		}else{
			this.grandir(false);
			this.showStatut();
		}
	} // void
	
	
}
