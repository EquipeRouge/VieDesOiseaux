package com.modele;

import java.util.List;

public interface Statut {

	void deplacement();

	boolean isReproductionOK(Animal a);

	List<Animal> seReproduire(Animal a);

	void grandir(boolean vivre);

}