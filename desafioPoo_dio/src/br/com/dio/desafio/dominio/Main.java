package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Aprendendo java");
		curso1.setCargaHoraria("8 hrs");
		
		
		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Aprendendo js");
		curso2.setCargaHoraria("4 hrs");
		
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("Descricção mentoria java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);

	}

}