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
	
	int vitesse = 1; 
	
	public PointDeplaceable(int depX, int depY, int arvX, int arvY ){
		xInit = depX;
		yInit = depY; 
		
		xFinal = arvX;
		yFinal = arvY;
	}

	
	public void deplacer(){
		if ((xFinal > xInit) && (yFinal > yInit)){
			xInit = xInit + (((xFinal - xInit) / (yFinal - yInit) ) * vitesse);
			yInit = yInit + (((yFinal - yInit) / (xFinal - xInit) ) * vitesse);
			
			if ((xInit >= xFinal) || (yInit >= yFinal)){
//				x = xFinal;
//				y = yFinal;
				
				xFinal = (double)(Math.random() *750);
				yFinal = (double)(Math.random() *550);
			}
		}
		
		else if ((xFinal <= xInit) && (yFinal <= yInit)){
			xInit = xInit - (((xFinal - xInit) / (yFinal - yInit) ) * vitesse);
			yInit = yInit - (((yFinal - yInit) / (xFinal - xInit) ) * vitesse);
			
			if ((xInit <= xFinal) || (yInit <= yFinal)){
				
				xFinal = (double)(Math.random() *750);
				yFinal = (double)(Math.random() *550);
			}
		}
		
		if ((xFinal <= xInit) && (yFinal > yInit)){
			xInit = xInit + (((xFinal - xInit) / (yFinal - yInit) ) * vitesse);
			yInit = yInit - (((yFinal - yInit) / (xFinal - xInit) ) * vitesse);
			
			if ((xInit <= xFinal) || (yInit > yFinal)){
				
				xFinal = (double)(Math.random() *750);
				yFinal = (double)(Math.random() *550);
			}
		}
		
		else if ((xFinal > xInit) && (yFinal <= yInit)){
			xInit = xInit - (((xFinal - xInit) / (yFinal - yInit) ) * vitesse);
			yInit = yInit + (((yFinal - yInit) / (xFinal - xInit) ) * vitesse);
			
			if ((xInit > xFinal) || (yInit <= yFinal)){
				
				xFinal = (double)(Math.random() *750);
				yFinal = (double)(Math.random() *550);
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
	
	
	

}