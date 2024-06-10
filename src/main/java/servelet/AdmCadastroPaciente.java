package servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PacienteDAO;
import entidade.Paciente;

/**
 * Servlet implementation class AdmCadastroPaciente
 */
@WebServlet("/AdmCadastroPaciente")
public class AdmCadastroPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdmCadastroPaciente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PacienteDAO dao = new PacienteDAO();
        Paciente paciente = new Paciente();

        Integer idAdm = dao.getIdAdm();
        if (idAdm != null) {
            paciente.setId_adm(idAdm);

            paciente.setNome(request.getParameter("nome"));
            paciente.setEmail(request.getParameter("email"));
            paciente.setCpf(request.getParameter("cpf"));
            paciente.setLogin(request.getParameter("login"));
            paciente.setSenha(request.getParameter("senha"));

            dao.admInserir(paciente);

            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("erro.jsp");
        }
	}

}
