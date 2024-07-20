package br.com.dio.desafio.dominio;

public class Curso {
	String titulo;
	String descricao;
	String cargaHoraria;
	
	
	
	public Curso() {
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso cargaHoraria =" +  cargaHoraria 
				+ ", descricao =" + descricao + 
				", titulo =" + titulo;
	}
	
	

}
