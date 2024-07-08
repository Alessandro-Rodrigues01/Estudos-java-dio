package ordenacao_set;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
private String nome;
private long cod;
private double preco;
private int quantidade;


public Produto(long cod, String nome, double preco, int quantidade) {
	this.nome = nome;
	this.cod = cod;
	this.preco = preco;
	this.quantidade = quantidade;
}


public String getNome() {
	return nome;
}



public long getCod() {
	return cod;
}



public double getPreco() {
	return preco;
}



public int getQuantidade() {
	return quantidade;
}

@Override
public int compareTo(Produto p) {
	return nome.compareToIgnoreCase(p.getNome());
}



@Override
public int hashCode() {
	return Objects.hash(cod);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Produto other = (Produto) obj;
	return cod == other.cod;
}


@Override
public String toString() {
	return "Produto cod=" + 
cod + ", nome=" + nome 
+ ", preco=" + preco 
+ ", quantidade=" + quantidade;
}




}

class ComparatorPorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}

