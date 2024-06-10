package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import entidade.Medico;


public class MedicoDAO extends DAO {
	
	Medico medico;
	
	public MedicoDAO() {
		this.conexao = new Conexao();
	}

	public void inserir(Medico medico) {
	    sql = "insert into Medico (id_crm, nome, Administrador_id_adm, Especialidade_id_especialidade) values (?, ?, ?, ?)";
	    
	    try(Connection connection = conexao.conectar();
	    	PreparedStatement ps = connection.prepareStatement(sql);) {
	        
	        ps.setString(1, medico.getId_crm());
	        ps.setString(2, medico.getNome());
	        ps.setInt(3, medico.getId_adm());
	        ps.setInt(4, medico.getId_especialidade());
	        ps.execute();
	        connection.close();
	    } catch (SQLException e) {
	        System.out.println("Erro ao inserir medico\n " + e);
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
	

	}
	

	