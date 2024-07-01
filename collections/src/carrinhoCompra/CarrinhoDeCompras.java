package carrinhoCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itensLista;

	public CarrinhoDeCompras() {
		this.itensLista = new ArrayList<Item>();
	}
	
	
public void adicionarItem(String nome, double preco, int quantidade) {
	Item item = new Item(nome, preco, quantidade);
	this.itensLista.add(item);
}

public void removerItem(String nome) {
	List<Item> itensparaRemover = new ArrayList<Item>();
	if (!itensLista.isEmpty()) {
		for (Item i : itensLista) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itensparaRemover.add(i);
			}
		} 
		itensLista.removeAll(itensparaRemover);
	}else {
		 System.out.println("A lista está vazia!");
	}
}
	

public double calcularValorTotal() {
	double valorTotal = 0d;
	if (!itensLista.isEmpty()) {
		for (Item item : itensLista) {
			double valorItem = item.getPreco() * item.getQuantidade();
			valorTotal += valorItem;
		}
		return valorTotal;
	}else {
		throw new RuntimeException("Lista vazia");
	}
}

public void exibirItens() {
	if (!itensLista.isEmpty()) {
	      System.out.println(this.itensLista);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
}
	
public static void main(String[] args) {
    // Criando uma instância do carrinho de compras
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
  }
}

