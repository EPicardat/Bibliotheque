package Metier;

import java.util.ArrayList;
import java.util.List;

public class Section {

	private int id;
	private String nom;
	private List<Livre> listeLivre;
	
	
	public Section(String nom) {
		this.nom = nom;
		this.listeLivre = new ArrayList<Livre>();
		
	}
	
	
}
