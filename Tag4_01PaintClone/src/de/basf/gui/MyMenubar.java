package de.basf.gui;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MyMenubar extends MenuBar {
	
	public MyMenubar() {
		Menu menu;
		MenuItem menuItem;
		
		
		menu = new Menu("Datei");
		
		menuItem = new MenuItem("beenden");
		menu.add(menuItem);
		
		add(menu);
		
		
		menu = new Menu("Formen");
		
		menuItem = new MenuItem("Linie");
		menu.add(menuItem);
		
		menuItem = new MenuItem("Oval");
		menu.add(menuItem);

		menuItem = new MenuItem("Rechteck");
		menu.add(menuItem);

		menu.addSeparator();
		
		menuItem = new MenuItem("L�schen");
		menu.add(menuItem);

		
		add(menu);
	}

}
