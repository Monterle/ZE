package Gui;

import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//Graphische Representation
@SuppressWarnings("serial")
public class Gui extends JFrame {
	
	//Komponenten des JFrame - Schildchen, private - sollen nicht von außen angefasst werden
	private JButton buttonBearbeiten;
	private JButton buttonEntfernen;
	private JButton buttonHinzufuegen;
	private JComboBox auswahlFehlgruende;
	private JTextArea eintraege;
	
	
	
	//Konstruktor, Titel des Taschenrechners und Operator zum Rechnen im Button
	public Gui(String titel) {
		
		
		
		//Wir erben aus JFrame deshalb gibt es die Methode setTitel - wird geerbt durch extends
		setTitle(titel);
		//schließe Programm
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
			//Layout - setzt alle Komponenten hintereinander - wenn voll dann nächste Zeile
			setLayout(new FlowLayout());
		
		
		
		//Größe des Fensters
		setSize(700, 400);
		//Größe später verändern ? nein
		setResizable(false);
		
		
			//Aufruf der Komponenten
			initComponents();
			//Reihenfolge wichtig
			add(buttonHinzufuegen);
			add(buttonBearbeiten);
			add(buttonEntfernen);
			add(auswahlFehlgruende);
			add(eintraege);
			
		
		//Position mittig
		setLocationRelativeTo(null);
		//sichtbar gemacht
		setVisible(true);
		
	
			
	}
	private void initComponents() {
		
		String[] fehlgruende = {"Urlaub", "Ueberstundenaufbau", "Ueberstundenabbau","Hochzeit", "Sterbefall"};
		
		//8 - Breite des Feldes in Zeichen
		auswahlFehlgruende = new JComboBox(fehlgruende);
		
		eintraege = new JTextArea(20,200);
		// einträge.setSize(500, 200);
		
		//Bild des Button hinzufügen + Größe verändern
				ImageIcon x_hinzu = new ImageIcon(getClass().getResource("Button_hinzufügen.jpg"));
				
				Image image1 = x_hinzu.getImage();
				Image newimg1 = image1.getScaledInstance(25, 30, Image.SCALE_SMOOTH);
				x_hinzu = new ImageIcon(newimg1);
				
				// Button mit Text und Icon
				buttonHinzufuegen = new JButton("",x_hinzu);
				
		//Bild des Button hinzufügen + Größe verändern
				ImageIcon x_bearb = new ImageIcon(getClass().getResource("Button_bearbeiten.jpg"));
				
				Image image2 = x_bearb.getImage();
				Image newimg2 = image2.getScaledInstance(25, 30, Image.SCALE_SMOOTH);
				x_bearb = new ImageIcon(newimg2);
				
				// Button mit Text und Icon
				buttonBearbeiten= new JButton("",x_bearb);
		
		//Bild des Button hinzufügen + Größe verändern
		ImageIcon x_loeschen = new ImageIcon(getClass().getResource("Button_loeschen_neu.jpg"));
		
		Image image3 = x_loeschen.getImage();
		Image newimg3 = image3.getScaledInstance(25, 30, Image.SCALE_SMOOTH);
		x_loeschen = new ImageIcon(newimg3);
		
		// Button mit Text und Icon
		buttonEntfernen = new JButton("",x_loeschen);
		
		/*
		 * Button eine Funktion geben 
		 * 2 Möglichkeiten: Entweder neue Klasse mit Rechnen und Action listener
		 * oder Lasse die Klasse Gui direkt den Actionlistener implementieren via implements
		 * oder direkt
		 */
		
		}
	}

