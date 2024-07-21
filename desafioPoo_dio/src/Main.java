
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		// conteudo criado
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Aprendendo java");
		curso1.setCargaHoraria(8);

		// conteudo criado
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Aprendendo js, ");
		curso2.setCargaHoraria(4);

		// conteudo criado
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("Descrição mentoria java, ");
		mentoria.setData(LocalDate.now());

		// conteudos adcionados no bootcamp
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescrição("Descricão bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		// inscrever se aos cursos do bootcamp.
		Dev dev = new Dev();
		dev.setNome("Alessandro");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos " + dev.getNome() + dev.getConteudoInscritos());
		dev.progredir();
		dev.progredir();

		System.out.println("--");
		System.out.println("Conteudos inscritos " + dev.getNome() + dev.getConteudoInscritos());
		System.out.println("Conteudos concluidos " + dev.getNome() + dev.getConteudosConcluidos());
		System.out.println("XP: " + dev.calcularTotalXp());

		System.out.println("---------------");

		Dev dev2 = new Dev();
		dev2.setNome("João");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos " + dev2.getNome() + dev2.getConteudoInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();

		System.out.println("--");
		System.out.println("Conteudos inscritos " + dev2.getNome() + dev2.getConteudoInscritos());
		System.out.println("Conteudos concluidos " + dev2.getNome() + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());

	}

}
