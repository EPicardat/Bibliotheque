package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Pour se connecter à la BDD

public class DBConnection {
	
	private static final String url = "";
	private static final String user = "root";
	private static final String passwd = "jdbc:mysql://localhost:3306/bibliotheque";
	private static DBConnection single;
	private Connection cnx;

	private DBConnection() throws SQLException {

		cnx = DriverManager.getConnection(url,user,passwd);
	}
	
	public static Connection getConnection() {
		if(null==single) {
			try {
				single=new DBConnection();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		return (null != single) ? single.getCnx() : null;	
	}

	public Connection getCnx() {
		return cnx;
	}
	
	public void closeCnx() {
		try {
			cnx.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
