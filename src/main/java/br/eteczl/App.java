package br.eteczl;

import java.util.ArrayList;

import model.Usuario;
import persistence.UsuarioDAO;

public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Usuario> listarUsuarios = new UsuarioDAO().listarUsuarios();
    	for(Usuario u : listarUsuarios) {
    		System.out.println(u.getNome());
    	}
    }

}
