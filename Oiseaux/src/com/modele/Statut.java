package com.modele;

import java.util.ArrayList;
import java.util.List;

public interface Statut {

	boolean isReproductionOK(Animal a);

	ArrayList<Oiseau> seReproduire(Oiseau a);

	void grandir(boolean vivre);

}