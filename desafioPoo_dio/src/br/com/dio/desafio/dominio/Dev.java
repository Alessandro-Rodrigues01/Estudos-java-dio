package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}

	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsIncritos().add(this);

	}

	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get()); // add na lista concluidos
			this.conteudoInscritos.remove(conteudo.get()); // remove da lista de inscrito
		} else {
			System.err.println("Você não esta matriculado em nenhum conteúdo!");
		}

	}

	public double calcularTotalXp() {

		return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
	}

	/*
	 * public double calcularTotalXp() { Iterator<Conteudo> iterator =
	 * this.conteudosConcluidos.iterator(); double soma = 0;
	 * while(iterator.hasNext()){ double next = iterator.next().calcularXp(); soma
	 * += next; } return soma;
	 * 
	 * }
	 */

	@Override
	public int hashCode() {
		return Objects.hash(conteudoInscritos, conteudosConcluidos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoInscritos, other.conteudoInscritos)
				&& Objects.equals(conteudosConcluidos, other.conteudosConcluidos) && Objects.equals(nome, other.nome);
	}

}
