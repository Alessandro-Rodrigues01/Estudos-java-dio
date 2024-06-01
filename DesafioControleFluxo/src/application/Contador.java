package application;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = sc.nextInt();
		System.err.print("Digite o segundo parâmetro: ");
		int parametroDois = sc.nextInt();
		sc.close();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();

		}

		int contagem = parametroDois - parametroUm;
		for (int n = 1; n <= contagem; n++) {
			System.out.println("Imprimindo o numero " + n);
		}

	}

}
