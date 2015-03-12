package com.ressources;

import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;


public class PointDeplaceable extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private static final int XSIZE = 10;
	
	private static final int YSIZE = 10;
		
	double xInit;
	double yInit;
	
	double xFinal;
	double yFinal;
	
	public int vitesse = 2; 
	
	public PointDeplaceable(int depX, int depY, int arvX, int arvY ){
		xInit = depX;
		yInit = depY; 
		
		xFinal = arvX;
		yFinal = arvY;
	}

	
	public void deplacer(double temps){
		
		if ((xFinal > xInit) && (yFinal > yInit)){
			double distance = calculDistance(temps, vitesse);
			double distanceTotale = calculDistanceTotale(xInit, xFinal, yInit, yFinal);
			double ratio = calculRatio(distance, distanceTotale);
			
			xInit = xInit + calculIncrementation(ratio, xInit, xFinal);
			yInit = yInit + calculIncrementation(ratio, yInit, yFinal);
						
			if ((xInit >= xFinal) || (yInit >= yFinal)){
				xFinal = newCoordonnee(750);
				yFinal = newCoordonnee(550);
			}
		}
		
		else if ((xFinal <= xInit) && (yFinal <= yInit)){
			double distance = calculDistance(temps, vitesse);
			double distanceTotale = calculDistanceTotale(xInit, xFinal, yInit, yFinal);
			double ratio = calculRatio(distance, distanceTotale);
			
			xInit = xInit + calculIncrementation(ratio, xInit, xFinal);
			yInit = yInit + calculIncrementation(ratio, yInit, yFinal);
			
			if ((xInit <= xFinal) || (yInit <= yFinal)){
				
				xFinal = newCoordonnee(750);
				yFinal = newCoordonnee(550);
			}
		}
		
		if ((xFinal <= xInit) && (yFinal > yInit)){
			double distance = calculDistance(temps, vitesse);
			double distanceTotale = calculDistanceTotale(xInit, xFinal, yInit, yFinal);
			double ratio = calculRatio(distance, distanceTotale);
			
			xInit = xInit + calculIncrementation(ratio, xInit, xFinal);
			yInit = yInit + calculIncrementation(ratio, yInit, yFinal);
			
			if ((xInit <= xFinal) || (yInit > yFinal)){
				
				xFinal = newCoordonnee(750);
				yFinal = newCoordonnee(550);
			}
		}
		
		else if ((xFinal > xInit) && (yFinal <= yInit)){
			double distance = calculDistance(temps, vitesse);
			double distanceTotale = calculDistanceTotale(xInit, xFinal, yInit, yFinal);
			double ratio = calculRatio(distance, distanceTotale);
			
			xInit = xInit + calculIncrementation(ratio, xInit, xFinal);
			yInit = yInit + calculIncrementation(ratio, yInit, yFinal);
			
			if ((xInit > xFinal) || (yInit <= yFinal)){
				
				xFinal = newCoordonnee(750);
				yFinal = newCoordonnee(550);
			}
		}
		
	}
	
	public double getxInit() {
		return xInit;
	}


	public double getyInit() {
		return yInit;
	}


	public double getxFinal() {
		return xFinal;
	}


	public void setxFinal(double xFinal) {
		this.xFinal = xFinal;
	}


	public double getyFinal() {
		return yFinal;
	}


	public void setyFinal(double yFinal) {
		this.yFinal = yFinal;
	}


	public Ellipse2D getForme() {
		return new Ellipse2D.Double(xInit, yInit, XSIZE, YSIZE);
	}
	
	public static double calculDistance(double temps, double vitesse){
		return temps*vitesse;
	}
	
	public static double calculDistanceTotale(double xInit, double xFinal, double yInit, double yFinal){
		return Math.sqrt(((xInit-xFinal)*(xInit-xFinal))+((yInit-yFinal)*(yInit-yFinal)));
	}
	
	public static double calculRatio (double distance, double distanceTotale){
		return distance/distanceTotale;
	}
	
	public static double calculIncrementation(double ratio, double dpt, double arv){
		return (ratio*(arv-dpt));
	}
	
	public static double newCoordonnee(int max){
		return Math.random()*max;
	}
	
	
	

}