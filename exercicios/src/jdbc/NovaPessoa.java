package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql); // A partir do PreparedStatement é possível passar parametros pra consulta, 
																// serve tambem para evitar SQLInjection, nunca concatene string
		stmt.setString(1, nome); // vai considerar tudo digitado como uma string na hora de montar consulta SQL
//		stmt.setInt(2, 100); // setar id 100
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");
		entrada.close();
	}
}