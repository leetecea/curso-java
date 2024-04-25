package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	public static Connection getConexao() { // metodo estatico, pode ser acessado de qualquer obj
		
		try {
//			Properties prop = getProperties();
//			final String url = prop.getProperty("banco.url");
//			final String usuario = prop.getProperty("banco.usuario");
//			final String senha = prop.getProperty("banco.senha");
			
			final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
			final String usuario = "root";
			final String senha = "admin";
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) { // troca uma exceção checada por uma não checada
			throw new RuntimeException(e);
		}
	}
	
//	private static Properties getProperties() throws IOException {
//		Properties prop = new Properties();
//		String caminho = "/conexao.properties";
//		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
//		return prop;
//		
//	}
}