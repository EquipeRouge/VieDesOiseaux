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
		this.parents = Parents.addParents(null, null);
		this.statut = new Oeuf();
	}
	
	Oiseau(Oiseau pere, Oiseau mere){
		this.sexe = this.setSexe();
		this.dureeDeVie = this.calculDureeDeVie();
		this.parents = Parents.addParents(pere, mere);
		this.statut = new Oeuf();	
	}

	void deplacement(){
		super.deplacement();
	};
	
	// Méthodes

	

//	boolean seReproduire(Animal a) {
//		return ((this.isReproductible()) && (a.isReproductible()));
//
//	}
}
