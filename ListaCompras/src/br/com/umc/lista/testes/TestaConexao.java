package br.com.umc.lista.testes;

import java.sql.Connection;

import br.com.umc.lista.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args){
		try{
			Connection connection = new ConnectionFactory().getConnection();
			System.out.println("Conexao Aberta");
			connection.close();
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
}
