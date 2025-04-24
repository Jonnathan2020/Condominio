package br.com.condominio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.condominio.model.Funcionario;

public class FuncionarioDao {
	private Connection con = null;
	
	public Connection getCon() {
		return con;
	}
	
	public void setCon(Connection con) {
		this.con = con;
	}
	
	public FuncionarioDao(Connection con) {
		setCon(con);
	}

	
	public String inserir(Funcionario funcionario) {
		String sql = "insert into funcionario(nome, idade, salario) values (?,?,?)";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, funcionario.getNome());
			ps.setInt(2, funcionario.getIdade());
			ps.setDouble(3, funcionario.getSalario());
			
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} 
			else {
				return "Erro inserir";
			}
			
		}
		
		 catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String deletar(Funcionario funcionario) {
		String sql = "delete from funcionarios";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, funcionario.getNome());
	
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} 
			else {
				return "Erro ao deletar";
			}
			
		}
		
		 catch (SQLException e) {
			return e.getMessage();
		}
	}
}

