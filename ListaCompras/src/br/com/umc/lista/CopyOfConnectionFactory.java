package br.com.umc.lista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CopyOfConnectionFactory {

	public Connection getConnection() throws SQLException {
		System.out.println("conectando ...");
		
		try {
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		}

		return DriverManager.getConnection("jdbc:jtds:sqlserver//localhost/lista_compras",
				"root", "root");
	}
}
