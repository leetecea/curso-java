package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; // nao verifica o certificado do servidor, mas usa uma conexao segura entre a aplicação e o BD
		final String usuario = "root";
		final String senha = "admin";
		
		Connection conexao = DriverManager
 				.getConnection(url, usuario, senha); // DriverManager -> responsavel por criar a conexçao com o BD
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
		
	}
}
