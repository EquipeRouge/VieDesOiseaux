package com.modele;
import com.ressources.*;

public class Oiseau extends Animal {

	final static int VITESSE_MAX = 10;
	final static int VITESSE_MOY = 5;
	final static int VITESSE_MIN = 0;
	
	Statut statut;
	
	// Constructeur 
	Oiseau(){
		this.sexe = this.setSexe();
		this.dureeDeVie = this.calculDureeDeVie();
		this.famille = new Famille();
		this.statut = new Oeuf();
	}
	
	Oiseau(Famille pere, Famille mere){
		this.sexe = this.setSexe();
		this.dureeDeVie = this.calculDureeDeVie();
		this.famille = new Famille(this,pere, mere);
		this.statut = new Oeuf();	
	}

	void deplacement(){
		super.deplacement();
	};
	
}
