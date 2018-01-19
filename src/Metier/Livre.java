package Metier;

import java.util.ArrayList;
import java.util.List;

public class Livre {
	
	private int id;
	private String titre;
	private int code;
	private List<Auteur> ListeAuteur;
	
	public Livre(String pTitre, int pCode) {
		this.titre = pTitre;
		this.code = pCode;
		ListeAuteur = new ArrayList<Auteur>();	
	}
	

}
