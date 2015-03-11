package com.ressources;
import com.modele.*;

public class Parents {
	
	Animal pere;
	Animal mere;
	boolean vide;
	
	// Constructeurs
	
	private Parents() {
		this.pere=null;
		this.mere=null;
		this.vide=true;
	}
	
	private Parents(Animal pere, Animal mere) {
		this.pere = pere;
		this.mere = mere;
		this.vide = false;
	}
	
	// Getter et Setter
	
	public Animal getPere() {
		return pere;
	}

	public Animal getMere() {
		return mere;
	}

	public boolean isVide() {
		return vide;
	}

	// Méthodes
	
	public static Parents addParents(Animal pere, Animal mere){
		
		if (pere == null || mere == null) {  // Si seulement l'un des deux est null c'est impossible !!!
			return new Parents();
		}
		return new Parents(pere, mere);
	}
	
	
	
	

}
