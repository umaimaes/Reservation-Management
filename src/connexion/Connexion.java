package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	private static final String URL="jdbc:mysql://localhost:3306/ReservationBD";
	private static final String  USER="root";
	private static final String  PASSWORD="";
	private static Connection  connection;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("pilote is charged");
			connection=DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("connection a la bd reussi");
		}catch(SQLException e){
			System.out.println("erreur de chargement du pilote"+e);
		}
		catch(ClassNotFoundException e) {
			System.out.println("erreur"+e);
		}
	}
	
	public static Connection getCnx(){
		return connection;
	}
}
