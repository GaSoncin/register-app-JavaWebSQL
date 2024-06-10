package entidade;

public class Especialidade {

	private int id_especialidade;
	private String tipo_especialidade;
	private double pagamneto;

	public int getId_especialidade() {
		return id_especialidade;
	}

	public void setId_especialidade(int id_especialidade) {
		this.id_especialidade = id_especialidade;
	}

	public String getTipo_especialidade() {
		return tipo_especialidade;
	}

	public void setTipo_especialidade(String tipo_especialidade) {
		this.tipo_especialidade = tipo_especialidade;
	}

	public double getPagamneto() {
		return pagamneto;
	}

	public void setPagamneto(double pagamneto) {
		this.pagamneto = pagamneto;
	}
}