package com.modele;

import java.util.Random;

public enum Sexe {
	MALE,
	FEMELLE,
	HERMAPHRODITE;

	public static Random generateurDeSexe = new Random();
	
	public <T> T randomElement(T[] elements){
		return elements[generateurDeSexe.nextInt(elements.length)];
	}
	
}
