package produtos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MostraProduto")
public class MostraProdutoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		ProdutoDb produto = new ProdutoDb();
		
		req.setAttribute("produto", produto.buscarProdutoId(id));
		
		RequestDispatcher rd = req.getRequestDispatcher("/formAlteraProduto.jsp");
		rd.forward(req, resp);
	}

}
