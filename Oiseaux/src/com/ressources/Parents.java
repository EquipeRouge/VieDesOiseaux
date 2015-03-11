package com.ressources;
import com.modele.Oiseau;

public class Parents {
	
	Oiseau pere;
	Oiseau mere;
	boolean vide;
	
	// Constructeurs
	
	private Parents() {
		this.pere=null;
		this.mere=null;
		this.vide=true;
	}
	
	private Parents(Oiseau pere, Oiseau mere) {
		this.pere = pere;
		this.mere = mere;
		this.vide = false;
	}
	
	// Getter et Setter
	
	public Oiseau getPere() {
		return pere;
	}

	public Oiseau getMere() {
		return mere;
	}

	public boolean isVide() {
		return vide;
	}

	// Méthodes
	
	public static Parents addParents(Oiseau pere, Oiseau mere){
		
		if (pere == null || mere == null) {  // Si seulement l'un des deux est null c'est impossible !!!
			return new Parents();
		}
		
		return new Parents(pere, mere);
	}
	
	
	
	

}
