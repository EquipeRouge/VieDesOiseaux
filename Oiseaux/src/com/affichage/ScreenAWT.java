package com.affichage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.ressources.PointDeplaceable;

class ScreenAWT extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static final int DELAY = 30;
	
	public static int screenX= 600;
	public static int screenY = 800;
	public int duree = 800;
	
	private ComposantDeplacement comp;
	
	public ScreenAWT(){
		
		comp = new ComposantDeplacement();
		
		add(comp, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		addButton(buttonPanel, "Demarrer", demarrer); 
		add(buttonPanel, BorderLayout.SOUTH);
		comp.setBackground(Color.decode("#B0E4E8"));
		
		setSize(screenY, screenX);
		setTitle("La vie des Oiseaux");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public void addButton(Container c, String title, ActionListener listener) {
		JButton button = new JButton(title);
		c.add(button);
		button.addActionListener(listener);
	}
	
	ActionListener demarrer = new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			addBird();
		}
	};
	
	
	
	public void addBird() {
		try {
			PointDeplaceable point = new PointDeplaceable(20, 20, 100, 200);
			PointDeplaceable point2 = new PointDeplaceable(20, 20, 20, 20);
			PointDeplaceable pointF = new PointDeplaceable(500, 300, 500, 300);
			comp.add(point);
			comp.add(point2);
			comp.add(pointF);

			for (int i = 1; i <= duree; i++) {
				point.deplacer(10);
				System.out.println(point.getxInit() + "= x");
				System.out.println(point.getyInit() + "= y");
				System.out.println(point.getxFinal() + "= xFinal");
				System.out.println(point.getyFinal() + "= yFinal");
				comp.paint(comp.getGraphics());
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException e) {
		}
	}
	
	class ComposantDeplacement extends JPanel {
		
		private static final long serialVersionUID = 1L;

		private ArrayList<PointDeplaceable> points = new ArrayList<PointDeplaceable>();

		public void add(PointDeplaceable ptd) {
			points.add(ptd);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g); // erase background
			Graphics2D g2 = (Graphics2D) g;
			for (PointDeplaceable ptd : points) {
				g2.fill(ptd.getForme());
			}
		}

	}

	

	
	public static void main(String[] args) {
		
		JFrame frame = new ScreenAWT();
//		PointDeplaceable b1 = new PointDeplaceable(20, 20, 100, 100);
//		frame.add(b1);
//		System.out.println(b1.getX() + " = x");
		
	}	
}