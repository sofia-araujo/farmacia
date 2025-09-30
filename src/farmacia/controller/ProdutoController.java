package farmacia.controller;

import java.util.ArrayList;
import java.util.List;

import farmacia.model.Produto;
import farmacia.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;
	
	@Override
	public void listarProdutos() {
		for(var produto : listaProdutos) {
			produto.visualizar();
		}	
	}

	@Override
	public void criarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\n🎉 Produto Cadastrado com sucesso!");
	}

	@Override
	public void atualizarProduto(Produto produto) {
		var buscarProduto = buscarNaCollection(produto.getId());
		
		if(buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
			System.out.printf("\nO Produto id: %d foi atualizado com sucesso!%n", produto.getId());
		}else {
			System.out.printf("\nO Produto id: %d não foi encontrado!%n", produto.getId());
		}
		
	}

	@Override
	public void consultarProduto(int id) {
		var produto = buscarNaCollection(id);
		
		if(produto != null) {
			produto.visualizar();
		}else {
			System.out.printf("\nO produto id: %d não foi encontrado!%n", id);
		}
		
	}

	@Override
	public void deletarProduto(int id) {
		var produto = buscarNaCollection(id);
		
		if(produto != null) {
			if(listaProdutos.remove(produto) == true) {
				System.out.printf("\nO produto id %d foi deletado com sucesso!%n", id);
			}
		}else {
			System.out.printf("\nO produto id: %d não foi encontrado!%n", id);
		}
		
	}
	
	public int gerarId() {
		return ++ id;
	}
	
	public Produto buscarNaCollection(int id) {
		for(var produto : listaProdutos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		
		return null;
	}
}
