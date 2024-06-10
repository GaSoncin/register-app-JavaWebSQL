package servelet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PacienteDAO;
import entidade.Paciente;



/**
 * Servlet implementation class CargoServlet
 */
@WebServlet("/cadastro")
public class CadastroServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @return 
     * @see HttpServlet#HttpServlet()
     */
    public void CadastroServlet() {
  
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PacienteDAO pacientedao = new PacienteDAO();
		Paciente paciente = new Paciente();
		
		paciente.setEmail(request.getParameter("email"));
		paciente.setNome(request.getParameter("nome"));
		paciente.setCpf(request.getParameter("cpf"));
		paciente.setLogin(request.getParameter("login"));
		paciente.setSenha(request.getParameter("senha"));
		
		pacientedao.inserir(paciente);	
		
		// redireciona para index.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
}