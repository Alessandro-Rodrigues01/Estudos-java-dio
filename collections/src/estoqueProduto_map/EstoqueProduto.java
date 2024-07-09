package estoqueProduto_map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProduto() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
	estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
	
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p  : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
			
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		for (Produto p : estoqueProdutosMap.values()) {
			if (p.getPreco() > maiorPreco) {
				produtoMaisCaro = p;
				maiorPreco = p.getPreco();
			}
			
		}
		return produtoMaisCaro;
		
		
	}
	
	//metodo main
	public static void main(String[] args) {
		EstoqueProduto estoqueProduto = new EstoqueProduto();
		
		estoqueProduto.adicionarProduto(12L, "Prod1", 2, 1.50);
		estoqueProduto.adicionarProduto(122L, "Prod2", 5, 20.50);
		estoqueProduto.adicionarProduto(155L, "Prod3", 6, 1.50);
		
		estoqueProduto.exibirProdutos();
		
		//produto mais caro
		System.out.println("O produto mais caro é: " + estoqueProduto.obterProdutoMaisCaro());
		estoqueProduto.obterProdutoMaisCaro();
		
		System.out.println("O valor total do estoque é: " + estoqueProduto.calcularValorTotalEstoque());
		
	}
}
