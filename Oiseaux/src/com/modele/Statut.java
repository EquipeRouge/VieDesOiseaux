package com.modele;

import java.util.List;

public interface Statut {

	

	void deplacement();

	// void setOiseau(Oiseau pOiseau);

	boolean isReproductionOK(Animal a);

	List<Animal> seReproduire(Animal a);
	
	void grandir(boolean vivre);

//	void deplacer();
	
	

}