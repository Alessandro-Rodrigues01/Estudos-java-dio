package candidatura;

public class ProcessoSeletivo3 {

	public static void main(String[] args) {
		imprimirSelecionados();

	}
	static void imprimirSelecionados() {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
		
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
		}
	}

}
