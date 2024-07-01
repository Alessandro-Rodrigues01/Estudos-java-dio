package ordenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	private List<Pessoa> listPessoa;
	
	
	
	// construtor com parametros vazios
	public OrdenacaoPessoa() { 
		this.listPessoa = new ArrayList<>();
	}


	public void adicionarPessoa(String nome, int idade, double altura) {
		listPessoa.add(new Pessoa(nome, idade, altura));
	}
	
	
	public List<Pessoa> ordenarPorIdade(){
		
		List<Pessoa> pessoaPorIdade = new ArrayList<>(listPessoa);
	Collections.sort(pessoaPorIdade);
	return pessoaPorIdade;
	}
	
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoaPorAltura = new ArrayList<Pessoa>(listPessoa);
		Collections.sort(pessoaPorAltura,  new ComparatorPorAltura());
		return pessoaPorAltura;
	}

	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		
		ordenacaoPessoa.adicionarPessoa("ale", 32, 1.50);
		ordenacaoPessoa.adicionarPessoa("nome 02", 30, 1.84);
	    ordenacaoPessoa.adicionarPessoa("nome 03", 16, 1.65);
	    ordenacaoPessoa.adicionarPessoa("nome 04", 25, 1.77);
		ordenacaoPessoa.adicionarPessoa("nome 05", 35, 1.68);
		
	System.out.println(ordenacaoPessoa.listPessoa);
	System.out.println(ordenacaoPessoa.ordenarPorAltura());
	System.out.println(ordenacaoPessoa.ordenarPorIdade());
	}
}

