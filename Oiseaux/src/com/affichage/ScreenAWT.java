package com.affichage;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

class ScreenAWT extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public static int screenX= 600;
	public static int screenY = 800;
	
	public ScreenAWT(){
		setSize(screenY, screenX);
		setTitle("La vie des Oiseaux");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.decode("#B0E4E8"));
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new ScreenAWT();
	}	
}