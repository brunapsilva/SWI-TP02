package produtos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AlteraProduto")
public class AlteraProdutoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer id = Integer.parseInt(req.getParameter("id"));
		String nome = req.getParameter("nome");
		int unidadeCompra = Integer.parseInt(req.getParameter("unidadeCompra"));
		String descricao = req.getParameter("descricao");
		double qtdPrevistoMes = Double.parseDouble(req.getParameter("qtdPrevistoMes"));
		double precoMaxComprado = Double.parseDouble(req.getParameter("precoMaxComprado"));

		ProdutoDb produto = new ProdutoDb();
		
		Produtos produtoId = produto.buscarProdutoId(id);
		
		produtoId.setNome(nome);
		produtoId.setUnidadeCompra(unidadeCompra);
		produtoId.setDescricao(descricao);
		produtoId.setQtdPrevistoMes(qtdPrevistoMes);
		produtoId.setPrecoMaxComprado(precoMaxComprado);

		resp.sendRedirect("ListaProdutos");

	}

}
