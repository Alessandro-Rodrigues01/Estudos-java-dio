package catalogoLivro;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
	private List<Livro> listaLivros;

	public CatalagoLivros() {
		this.listaLivros = new ArrayList<Livro>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		listaLivros.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {

		List<Livro> livroPorautor = new ArrayList<Livro>();
		if (!listaLivros.isEmpty()) { // retorna true se list conter elementos
			for (Livro l : listaLivros) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livroPorautor.add(l);

				}

			}

		}

		return livroPorautor;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {

		List<Livro> livroPorIntervaloAnos = new ArrayList<Livro>();
		if (!listaLivros.isEmpty()) {
			for (Livro l : listaLivros) {
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livroPorIntervaloAnos.add(l);
				}
			}

		}
		return livroPorIntervaloAnos;
	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!listaLivros.isEmpty()) {
			for (Livro l : listaLivros) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}

		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		
		CatalagoLivros catalogoLivros = new CatalagoLivros();
		// Adicionando livros ao catálogo
	    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
	    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
	    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
	    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

	    // Exibindo livros pelo mesmo autor
	    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

	    // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
	    System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

	    // Exibindo livros dentro de um intervalo de anos
	    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

	    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
	    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

	    // Exibindo livros por título
	    System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

	    // Exibindo livros por título (caso em que não há livros com o título especificado)
	    System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
		
	}

}
