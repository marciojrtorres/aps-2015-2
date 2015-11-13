package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import entidade.Pessoa;
import persistencia.DAO;

public class ExcluiForm extends JFrame 
	implements ActionListener {
	
	private DAO<Pessoa> dao;
	
	private JTextField nome = new JTextField(10);
	private JTextField sobrenome = new JTextField(10);
	private JButton exclui = new JButton("Excluir");

	public ExcluiForm(DAO<Pessoa> dao) {
		this.dao = dao;
		this.setTitle("ExcluiForm");
		this.setLayout(new FlowLayout());
		this.getContentPane().add(nome);
		this.getContentPane().add(sobrenome);
		this.getContentPane().add(exclui);
		exclui.addActionListener(this);
		this.pack();
		this.setVisible(true);		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Pessoa p = new Pessoa();
		p.setNome(nome.getText());
		p.setSobrenome(sobrenome.getText());
		dao.delete(p);
	}
	
}
