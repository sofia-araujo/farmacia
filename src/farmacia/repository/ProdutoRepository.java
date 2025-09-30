package farmacia.repository;

import farmacia.model.Produto;

public interface ProdutoRepository {
	
	// Métodos CRUD
	public void listarProdutos();
	public void criarProduto(Produto produto);
	public void atualizarProduto(Produto produto);
	public void consultarProduto(int id);
	public void deletarProduto(int id);
	
}
