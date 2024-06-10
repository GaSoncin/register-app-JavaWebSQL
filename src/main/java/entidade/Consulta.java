package entidade;

public class Consulta {

	private int id_consulta;
	private String date;
	private Paciente id_paciente;
	private Medico id_crm;

	public int getId_consulta() {
		return id_consulta;
	}

	public void setId_consulta(int id_consulta) {
		this.id_consulta = id_consulta;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Paciente getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(Paciente id_paciente) {
		this.id_paciente = id_paciente;
	}

	public Medico getId_crm() {
		return id_crm;
	}

	public void setId_crm(Medico id_crm) {
		this.id_crm = id_crm;
	}
}