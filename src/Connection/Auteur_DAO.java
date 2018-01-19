package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import metier.Auteur;

//Pour g�rer les requ�tes relatives aux Auteurs

public class Auteur_DAO {

	private static final String FindAll = null;
	private static final String AddAuteur = null;

	// m�thode
	public List<Auteur> findAllAuteurs() {

		// On se connecte � la BDD
		Connection cnx = DBConnection.getConnection();

		// On cr�e une liste pour receptionner les auteurs
		List<Auteur> listeAuteur = new ArrayList<Auteur>();

		if (cnx != null) {
			Statement st = null;

			try {
				st = cnx.createStatement();
				ResultSet rs = st.executeQuery(FindAll);
				while (rs.next()) {
					Auteur auteur = new Auteur(rs.getString("Nom"), rs.getString("Prenom"));
					listeAuteur.add(auteur);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		try {
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return listeAuteur;
	}
}
