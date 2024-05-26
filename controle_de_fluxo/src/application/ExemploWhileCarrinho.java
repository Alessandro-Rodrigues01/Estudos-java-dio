package application;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhileCarrinho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double mesada = 50.0;

		while (mesada > 0) {
			Double valorDoce = valorAleatorio();
			/*
			 * if (valorDoce > mesada) valorDoce = mesada;
			 */

			System.out.printf("Doce do valor:%.2f%s%n ", valorDoce, ", Adcionado no carrinho");
			mesada = mesada - valorDoce;

		}

		System.out.printf("Mesada:%.2f%n ", mesada);
		System.out.println("Joãozinho gastou toda a sua mesada em doces");

	}

	// metodo para inserir valor aleatorio
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 15); // valor de 2 a 15
	}

}
