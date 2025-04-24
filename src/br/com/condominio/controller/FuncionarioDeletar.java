package br.com.condominio.controller;

import java.sql.Connection;

import br.com.condominio.conexao.conexao;
import br.com.condominio.dao.FuncionarioDao;
import br.com.condominio.model.Funcionario;

public class FuncionarioDeletar {
	
	public static void main(String[] args) {
		Connection con = conexao.abrirConexao();
		
		Funcionario funcionario = new Funcionario();
		FuncionarioDao funcionarioDao= new FuncionarioDao(con);
		
		funcionario.setNome("Severino");
		System.out.println(funcionarioDao.deletar(funcionario));
	
		conexao.fecharConexao(con);
	}
}