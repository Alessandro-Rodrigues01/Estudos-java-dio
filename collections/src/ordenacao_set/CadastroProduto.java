package ordenacao_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
 private Set<Produto> produtoset;
 
 
 
 public CadastroProduto() {
	this.produtoset = new HashSet<>();
}



public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
	produtoset.add(new Produto(cod, nome, preco, quantidade));
	 
 }
 
public Set<Produto> exibirProdutoPorNome (){
	Set<Produto> produtoPorNome = new TreeSet<>(produtoset);
	return produtoPorNome;
	
}

public Set<Produto> exibirPorPreco(){
	Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
	produtoPorPreco.addAll(produtoset);
	return produtoPorPreco;
}



public static void main(String[] args) {
	CadastroProduto cadastroProduto = new CadastroProduto();
	cadastroProduto.adicionarProduto(1L, "Prod1", 8.50, 2);
	cadastroProduto.adicionarProduto(2L, "Prod2", 5d, 2);
	cadastroProduto.adicionarProduto(3L, "prod3", 4.55, 2);
	cadastroProduto.adicionarProduto(1L, "Prod4", 5.5, 2); //codigo repetido não adiciona pela regra do hashCod
	
	System.out.println(cadastroProduto.produtoset);
	
	//ordenar por nome
	System.out.println(cadastroProduto.exibirProdutoPorNome());
	
	//ordenar por preco
	System.out.println(cadastroProduto.exibirPorPreco());
	
}

}
