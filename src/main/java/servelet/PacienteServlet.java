package servelet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Paciente")
public class PacienteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private List<Consulta> consultasAgendadas = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obter os parâmetros do formulário
        String nomeDoutor = request.getParameter("inputState");
        String dataConsulta = request.getParameter("data");

        // Criar uma nova consulta com base nos parâmetros recebidos
        Consulta novaConsulta = new Consulta(nomeDoutor, dataConsulta);

        // Adicionar a nova consulta à lista de consultas agendadas
        consultasAgendadas.add(novaConsulta);

        // Redirecionar de volta para a página inicial ou para onde desejar
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }

    // Classe Consulta para representar uma consulta
    class Consulta {
        private String nomeDoutor;
        private String dataConsulta;

        public Consulta(String nomeDoutor, String dataConsulta) {
            this.nomeDoutor = nomeDoutor;
            this.dataConsulta = dataConsulta;
        }

        // Getters e setters se necessário

        @Override
        public String toString() {
            return "Consulta [Doutor: " + nomeDoutor + ", Data: " + dataConsulta + "]";
        }
    }
}
