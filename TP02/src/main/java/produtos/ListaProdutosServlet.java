package produtos;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListaProdutos")
public class ListaProdutosServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		ProdutoDb prod = new ProdutoDb();
		List <Produtos> produtos = prod.listarProdutos();
		
		req.setAttribute("produtos",produtos);

		RequestDispatcher rd = req.getRequestDispatcher("/listaProdutos.jsp");
		rd.forward(req, resp);;

	}

}
