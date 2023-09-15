package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Usuario;

public class UsuarioDAO implements UsuarioDAO_i{

	@Override
	public ArrayList<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		ArrayList<Usuario> listaDeusuarios = new ArrayList<>();
    	Connection c = new DatabaseConnectionFactory().getConnection();
    	try {
			 Statement stmt = c.createStatement();
			 ResultSet rs = stmt.executeQuery("select * from users;");
			 while(rs.next()) {
				 String nome = rs.getString("nome");
				 Usuario usuario = new Usuario(nome);
				 listaDeusuarios.add(usuario);
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaDeusuarios;
	}
	
}
