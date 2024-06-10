package entidade;

public class Medico {
	
	private Integer id_adm, id_especialidade;
	private String nome, id_crm;


	public String getId_crm() {
		return id_crm;
	}

	public void setId_crm(String id_crm) {
		this.id_crm = id_crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId_adm() {
		return id_adm;
	}

	public void setId_adm(Integer id_adm) {
		this.id_adm = id_adm;
	}

	public Integer getId_especialidade() {
		return id_especialidade;
	}

	public void setId_especialidade(Integer id_especialidade) {
		this.id_especialidade = id_especialidade;
	}
}