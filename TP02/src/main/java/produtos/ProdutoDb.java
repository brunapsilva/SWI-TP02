package produtos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProdutoDb {

	private static List<Produtos> listaProdutos = new ArrayList<Produtos>();
	private static Integer chaveSequencial = 1;

	public List<Produtos> listarProdutos() {
		return this.listaProdutos;
	}

	public void adiciona(Produtos produto) {
		adicionarProduto(produto);
	}

	private static void adicionarProduto(Produtos produto) {
		produto.setId(chaveSequencial++);
		listaProdutos.add(produto);
	}

	public void deletarProduto(Integer id) {
		Iterator<Produtos> iProdutos = listaProdutos.iterator();

		while (iProdutos.hasNext()) {
			Produtos produto = iProdutos.next();

			if (produto.getId() == id) {
				iProdutos.remove();
			}
		}
	}

	public Produtos buscarProdutoId(Integer id) {
		for (Produtos produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}

		return null;
	}

}
