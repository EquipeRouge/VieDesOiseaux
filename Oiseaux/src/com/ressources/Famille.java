package com.ressources;
import com.modele.Animal;

public class Famille {
	private Object enfant;
	private Famille pere;
	private Famille mere;
	private boolean Vide;
	private int indice;
	
	// CONSTRUCTEURS 
	public Famille(){
		this.Vide = true;
	}
	
	public Famille(Object enfant){
		this.enfant = enfant;
		this.Vide = false;
		this.pere = new Famille();
		this.mere = new Famille();
	}
	
	public Famille(Object enfant, Famille pere, Famille mere){
		this.enfant = enfant;
		this.pere = pere;
		this.mere = mere;
		this.Vide = false;
	}
	
	// ARBRE VIDE
	public boolean isVide(){
		return this.Vide;
	}
	
	// RACINE
	public Object getEnfant(){
		return this.enfant;
	}
	
	// FILS GAUCHE
	public Famille getPere(){
		return this.pere;
	}
	
	// FILS DROIT
	public Famille getMere(){
		return this.mere;
	}
	
	// INDICE
	public int getIndice(){
		return this.indice;
	}
	
	public void setIndice(int ind){
		this.indice = ind;
	}
	
	private boolean recherche(Object object){
		if (this.Vide){
			return false;
		}
		if (this.enfant == object){
			return true;		
		}else{
			return (this.pere.recherche(object) || this.mere.recherche(object));
		}
	}
	
	// RECHERCHE EN LARGEUR
	private boolean rechercheAvecIndice(Object object, int i){
		if(this.Vide){
			return false;
		}
		
		if(i==0){
			return false;
		}
		
		if (this.enfant == object){
			return true;		
		}else{
			i--;
			return (this.pere.rechercheAvecIndice(object, i) || this.mere.rechercheAvecIndice(object, i));
		}
	}
	
	// VERIFICATION DE L'INCESTE
	public boolean isInceste(Animal animal){
		return this.recherche(animal) && this.rechercheAvecIndice(animal, indice);
	}
	
	
//	// AFFICHAGE 
//	private void afficheInfixe(){
//		if (!(this.Vide)){
//			this.pere.afficheInfixe();
//			System.out.print(this.enfant);
//			this.mere.afficheInfixe();
//		}
//	}
//	
//	private void affichePrefixe(){
//		if (!(this.Vide)){
//			System.out.print(this.enfant);
//			this.pere.affichePrefixe();
//			this.mere.affichePrefixe();
//		}
//	}
//	
//	private void afficheSuffixe(){
//		if (!(this.Vide)){
//			this.pere.afficheSuffixe();
//			this.mere.afficheSuffixe();
//			System.out.print(this.enfant);
//		}
//	}
//	
//	private void affichePar(){
//		if (!(this.Vide)){
//			System.out.print("(");
//			this.pere.affichePar();
//			System.out.print(this.enfant);
//			this.mere.affichePar();
//			System.out.print(")");
//		}
//	}
	
	// AFFICHER EN ARBRE
//	private void afficheArb(int d){
//		if (!(this.Vide)){
//			
//			this.mere.afficheArb(d + 1);
//			for (int i = 0; i< d;i++){
//				System.out.print("   ");
//			}
//			System.out.print(this.enfant);
//			System.out.println();
//			this.pere.afficheArb(d + 1);
//		}
//	}
//	
//	private void afficheLignes(){
//		if (!(this.Vide)){
//			this.afficheArb(0);
//		}
//	}
	
	// RECHERCHE ASCENDANTS

//	// COMPTE LES SOMMETS
//	private int compteSommets(){
//		if (this.Vide){
//			return 0;
//		}else {
//			return 1 + this.pere.compteSommets() + this.mere.compteSommets();
//		}
//	}
//	
//	// NOMBRE DE FEUILLES
//	private int nbFeuilles(){
//		if (this.Vide){
//			return 0;
//		}else{
//			if (this.pere.Vide && this.mere.Vide){
//				return 1;
//			}else{
//				return this.pere.nbFeuilles() + this.mere.nbFeuilles();
//			}
//		}
//	}
//	
//	// NOMBRE DE NOEUDS
//	private int nbNI(){
//		if(this.Vide){
//			return -1;
//		}else{
//			return this.nbNoeudsInt();
//		}
//	}
//
//	private int nbNoeudsInt(){
//		if (this.Vide){
//			return 0;
//		}else{
//			if(this.pere.Vide && this.mere.Vide){
//				return 0;
//			}else{
//				return 1 + this.pere.nbNoeudsInt() + this.mere.nbNoeudsInt();
//			}
//		}
//	}
	

	
}
