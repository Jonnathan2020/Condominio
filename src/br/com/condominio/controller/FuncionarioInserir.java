package br.com.condominio.controller;

import java.sql.Connection;
import br.com.condominio.conexao.conexao;
import br.com.condominio.model.Funcionario;
import br.com.condominio.dao.FuncionarioDao;

public class FuncionarioInserir {
	
	public static void main(String[] args) {
		Connection con = conexao.abrirConexao();
		
		Funcionario funcionario = new Funcionario();
		FuncionarioDao funcionarioDao= new FuncionarioDao(con);
		
		funcionario.setNome("Severino");
		funcionario.setIdade(25);
		funcionario.setSalario(2.350);
		System.out.println(funcionarioDao.inserir(funcionario));
	
		conexao.fecharConexao(con);
	}
}
