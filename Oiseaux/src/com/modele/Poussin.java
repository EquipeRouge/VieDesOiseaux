package com.modele;

import java.util.List;

public class Poussin implements Statut {
	final static int VITESSE_MOY = 5;
	double vitesse;
	Oiseau oiseau;

	public Poussin(Oiseau pOiseau) {
		this.oiseau = pOiseau;
	}

	public void deplacement() {
		deplacement();
		this.vitesse = VITESSE_MOY;

	}

	public boolean isReproductionOK(Animal a) {
		// TODO Stub de la méthode généré automatiquement
		return false;
	}

	public List<Animal> seReproduire(Animal a) {
		// TODO Stub de la méthode généré automatiquement
		return null;
	}

	//Méthode permettant de gérer le passage à l'état adulte donc reproductible
	public void grandir(boolean vivre) {
		if(vivre){
		oiseau.setStatut(new Adulte(oiseau));
		oiseau.isReproductible =true;
		}else{
			oiseau.setStatut(new Mort(oiseau));
			}
	}
	
	// Test sur le satut
	 public String toString(){
	 return "poussin";
	 }

}
