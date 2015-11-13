package banco;

import entidade.Pessoa;
import gui.ExcluiForm;
import persistencia.PessoaDAO;
import persistencia.PessoaDAOSeguro;

public class Main2 {

	public static void main(String[] args) {
		
		// Representante/Embrulho/Delegado
		// Proxy/Wrapper/Delegate
		
		// "proxiado" deve ter uma interface
		PessoaDAO daoReal = new PessoaDAO();
		PessoaDAOSeguro proxy = new PessoaDAOSeguro(daoReal);
		
		// Mecânica: criar uma classe
		// que implemente a mesma interface do proxiado
		// tenha o proxiado como atributo
		// e intercepte a chamada dos métodos
		
		ExcluiForm form = new ExcluiForm(proxy);	
				
//		Pessoa p = new Pessoa();
//		p.setNome("Felipe");
//		p.setSobrenome("Santos");		
//		dao.insert(p);
		
//		p.setNome("Felipe");
//		p.setSobrenome("Santos' OR '1'='1");
//		
//		dao.delete(p);

	}

}
