package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionFactory {

	private Connection conn;
	private String stringDeConexao = "jdbc:mysql://localhost:3306;contabilidade";
	
	public Connection getConnection() {
		try {
			this.conn = DriverManager.getConnection(stringDeConexao, "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.conn;
	}
	
}
