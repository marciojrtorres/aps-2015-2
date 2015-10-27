package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entidade.Pessoa;

public class PessoaDAO implements DAO<Pessoa> {
	// constantes
	private static final String URL     = "jdbc:postgresql://localhost/cobaia";
	private static final String USUARIO = "postgres";
	private static final String SENHA   = "postgres";
	
	@Override
	public void insert(Pessoa p) {		
		try {
					
			String sql = "INSERT INTO pessoas "
					   + "VALUES ('" + p.getNome() + "', '" + p.getSobrenome() + "');";
			
			System.out.println(sql);
			
			Connection conexao = 
					DriverManager.getConnection(URL, USUARIO, SENHA);
			
			Statement comando = conexao.createStatement();
			
			int registros = comando.executeUpdate(sql);
			
			System.out.println(registros);
			
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void delete(Pessoa p) {
		try {
			
			String sql = "DELETE FROM pessoas "
					   + "WHERE nome = '" + p.getNome() 
					   + "' AND sobrenome = '" + p.getSobrenome() + "';";
			
			System.out.println(sql);
			
			Connection conexao = 
					DriverManager.getConnection(URL, USUARIO, SENHA);
			
			Statement comando = conexao.createStatement();
			
			int registros = comando.executeUpdate(sql);
			
			System.out.println(registros);
			
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Pessoa> select() {
		List<Pessoa> registros = new ArrayList<Pessoa>();
		
		try {
			
			String sql = "SELECT nome, sobrenome FROM pessoas";
						
			Connection conexao = 
					DriverManager.getConnection(URL, USUARIO, SENHA);
			
			Statement comando = conexao.createStatement();
			
			ResultSet resultado = comando.executeQuery(sql);
			
			while (resultado.next()) {
				Pessoa p = new Pessoa();
				p.setNome(resultado.getString("nome")); 
				p.setSobrenome(resultado.getString("sobrenome"));
				registros.add(p);
			}
			
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return registros;
	}

	@Override
	public void update(Pessoa antigo, Pessoa novo) {
		// TODO Auto-generated method stub		
	}


}
