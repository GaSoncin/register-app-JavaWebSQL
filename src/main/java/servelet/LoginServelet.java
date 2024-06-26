package servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PacienteDAO;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet("/LoginServelet")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        PacienteDAO pacienteDAO = new PacienteDAO();

        if (pacienteDAO.validacao(login, senha)) {
            response.sendRedirect("form/formPaciente.jsp");
        } else if ("admin".equals(login) && "admin".equals(senha)) {
            response.sendRedirect("form/formAdmin.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
	}

}
