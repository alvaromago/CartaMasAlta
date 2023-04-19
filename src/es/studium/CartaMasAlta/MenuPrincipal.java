package es.studium.CartaMasAlta;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class MenuPrincipal extends Frame
{
	private static final long seriaVersionUTD = 1L;
	
	Image nuevaPartida, ayuda, ranking, salir;
	Toolkit herramienta;
	
	
	public MenuPrincipal()
	{
		setLayout(null);
		setTitle("Carta Más Alta");
		setSize(600, 400);
		setBackground(Color.white);
		// Activamos la herramienta
		herramienta = getToolkit();
		// Cargar la imagen
		nuevaPartida = herramienta.getImage("new.png");
		ayuda = herramienta.getImage("help.png");
		ranking = herramienta.getImage("ranking.png");
		salir = herramienta.getImage("exit.png");
		setResizable(false);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(nuevaPartida, 50, 35, this);
		g.drawImage(ayuda, 200, 35, this);
		g.drawImage(ranking, 50, 200, this);
		g.drawImage(salir, 200, 200, this);
	}
}
