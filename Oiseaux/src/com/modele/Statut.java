package com.modele;

import java.util.List;

public interface Statut {

	boolean isReproductionOK(Animal a);

	List<Animal> seReproduire(Animal a);

	void grandir(boolean vivre);

}