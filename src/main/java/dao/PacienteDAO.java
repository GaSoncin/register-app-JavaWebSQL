package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexao.Conexao;
import entidade.Paciente;

public class PacienteDAO extends DAO{
	public PacienteDAO() {
		this.conexao = new Conexao();
	}
	
	private Conexao conexao;
	public void inserir(Paciente paciente) {
		String sql = "insert into Paciente (email, nome, cpf, login, senha) values (?, ?, ?, ?, ?)";

		try (Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setString(1, paciente.getEmail());
			ps.setString(2, paciente.getNome());
			ps.setString(3, paciente.getCpf());
			ps.setString(4, paciente.getLogin());
			ps.setString(5, paciente.getSenha());
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar paciente\n" + e);
		}
	}
	
	public void admInserir(Paciente pacienteADM) {
	    sql = "insert into Paciente (nome, email, cpf, login, senha, Administrador_id_adm) values (?, ?, ?, ?, ?, ?)";
	    
	    try(Connection connection = conexao.conectar()) {
	    	ps = connection.prepareStatement(sql);
	        
	    	ps.setString(1, pacienteADM.getNome());
	    	ps.setString(2, pacienteADM.getEmail());
	        ps.setString(3, pacienteADM.getCpf());
	        ps.setString(4, pacienteADM.getLogin());
	        ps.setString(5, pacienteADM.getSenha());
	        ps.setInt(6, pacienteADM.getId_adm());;
	        ps.execute();
	        connection.close();
	    } catch (SQLException e) {
	        System.out.println("Erro ao inserir paciente\n " + e);
	    }
	}
	
	public Integer getIdAdm() {

        String sql = "SELECT id_adm FROM Administrador";  

        try (Connection connection = conexao.conectar();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
        	
            if (rs.next()) {
                return rs.getInt("id_adm");
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }

        return null;
    }
	
	public boolean validacao(String login, String senha) {
        sql = "SELECT * FROM Paciente WHERE login = ? AND senha = ?";

        try (Connection connection = conexao.conectar()) {
            ps = connection.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            
            try (ResultSet resultSet = ps.executeQuery()) {
                return resultSet.next(); 
            }
        } catch (SQLException e) {
            System.out.println("Erro ao validar credenciais\n" + e);
        }
        return false;
    }
}