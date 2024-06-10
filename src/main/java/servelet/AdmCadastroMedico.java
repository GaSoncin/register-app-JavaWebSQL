package servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MedicoDAO;
import entidade.Medico;

/**
 * Servlet implementation class AdmCadastroMedico
 */
@WebServlet("/AdmCadastroMedico")
public class AdmCadastroMedico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdmCadastroMedico() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MedicoDAO dao = new MedicoDAO();
		Medico medico = new Medico();
		
		Integer idAdm = dao.getIdAdm();
		//Integer especialidade = 
		if (idAdm != null) {
			medico.setId_adm(idAdm);
			
			//medico.getId_crm(request.getParameter("id_crm"));
			medico.setNome(request.getParameter("nome"));
			
			dao.inserir(medico);	
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
			
		} else {
	        response.sendRedirect("erro.jsp");
	    }
	}

}
