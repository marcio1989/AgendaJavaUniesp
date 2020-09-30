
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AgendaServlet")
public class AgendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		System.out.println(">>>>> REQUEST " + request.getMethod());
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		request.setAttribute("login", login);
		
		if (login.equals("marcio") && senha.equals("1234")) {
			HttpSession session = request.getSession();
			session.setAttribute("Login", login);// retorna o nome do usuário logado
			RequestDispatcher rd = request.getRequestDispatcher("bemvindo.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			
		}
		
	}
}
