package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Pour se connecter à la BDD

public class DBConnection {
	
	private static final String url = "";
	private static final String user = "";
	private static final String passwd = "";
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

	
	

}
