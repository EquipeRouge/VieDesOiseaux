package com.modele;

import java.util.*;

import com.ressources.*;

public abstract class Animal {

	final static double DUREE_DE_VIE_MAX = 20;
	final static double DUREE_DE_VIE_MIN = 0;

	final static int HIGHER = 100;
	final static int LOWER = 0;

	// Attributs
	public int dureeDeVie;
	public int age;
	Date dateDeNaissance;
	double coordoneeX;
	double coordoneeY;
	double newCoordonneeX;
	double newCoordonneeY;
	int vitesse;
	Famille famille;

	boolean isReproductible = false;

	List<Animal> enfants;

	Sexe sexe;

	// M�thodes

	void deplacement() {
		this.coordoneeX = (int) (Math.random() * (HIGHER - LOWER)) + LOWER;
		this.coordoneeY = (int) (Math.random() * (HIGHER - LOWER)) + LOWER;
		this.newCoordonneeX = (int) (Math.random() * (HIGHER - LOWER)) + LOWER;
		this.newCoordonneeY = (int) (Math.random() * (HIGHER - LOWER)) + LOWER;
	};

	protected int calculDureeDeVie() {
		dureeDeVie = (int) ((Math.random() * (DUREE_DE_VIE_MAX - DUREE_DE_VIE_MIN)) + DUREE_DE_VIE_MIN);
		return dureeDeVie;
	}

	protected Sexe setSexe() {
		if ((Math.random() * 10) > 5) {
			return Sexe.FEMELLE;
		}
		return Sexe.MALE;
	}

	abstract List<Animal> seReproduire(Animal a);

}
