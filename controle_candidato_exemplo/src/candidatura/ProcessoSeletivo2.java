package candidatura;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    selecioneCandidatos();
	}
	static void  entrandoEmContato(String candidato) {
		
	}
	

	static void selecioneCandidatos() {
		String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
				"Daniela", "Jorge"};

		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 &&  candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendo();

			System.out.printf("O candidato (a) %s%s%.2f%n", candidato, " solicitou este valor de salário R$"
					+ " ",
					salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato (a) " + candidato + " foi selelcionado para a vaga");
				candidatosSelecionados++;

			}
			candidatosAtual++;

		}

	}

	static double valorPretendo() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200); // valor aleatorio de 1800 a 2200
	}


}
