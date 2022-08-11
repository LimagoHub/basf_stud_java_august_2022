package de.basf.gui;

import java.awt.Color;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenubar extends MenuBar {
	
	private PaintClone paintClone;
	
	public MyMenubar(PaintClone paintClone) {
		
		this.paintClone = paintClone;
		
		Menu menu;
		MenuItem menuItem;
		
		
		menu = new Menu("Datei");
		
		menuItem = new MenuItem("beenden");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.dispose();
				
			}
		});
		
		menu.add(menuItem);
		
		
		add(menu);
		
		
		menu = new Menu("Formen");
		
		menuItem = new MenuItem("Linie");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.setForm(PaintClone.Formen.LINIE);
				
			}
		});
		menu.add(menuItem);
		
		menuItem = new MenuItem("Oval");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.setForm(PaintClone.Formen.OVAL);
				
			}
		});
		menu.add(menuItem);

		menuItem = new MenuItem("Rechteck");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.setForm(PaintClone.Formen.RECHTECK);
				
			}
		});
		menu.add(menuItem);

		menu.addSeparator();
		
		menuItem = new MenuItem("Löschen");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.setForm(PaintClone.Formen.LOESCHEN);
				
			}
		});
		menu.add(menuItem);

		
		add(menu);
		
		menu = new Menu("Farben");
		
		menuItem = new MenuItem("weiss");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.setColor(Color.WHITE);
				
			}
		});
		menu.add(menuItem);
		
		menuItem = new MenuItem("rot");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.setColor(Color.RED);
				
			}
		});
		menu.add(menuItem);

		menuItem = new MenuItem("blau");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.setColor(Color.BLUE);
				
			}
		});
		menu.add(menuItem);

		
		menuItem = new MenuItem("grün");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.setColor(Color.GREEN);
				
			}
		});
		menu.add(menuItem);

		
		menuItem = new MenuItem("gelb");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.setColor(Color.YELLOW);
				
			}
		});
		menu.add(menuItem);

		
		menuItem = new MenuItem("pink");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.setColor(Color.PINK);
				
			}
		});
		menu.add(menuItem);

		
		add(menu);

	}

}
