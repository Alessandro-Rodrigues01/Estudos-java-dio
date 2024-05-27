package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploAboutMe {

	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Digite seu name: ");
			String nome = sc.nextLine();

			System.out.print("Digite seu sobrenome: ");
			String sobrenome = sc.next();

			System.out.print("Digite sua idade: ");
			int idade = sc.nextInt();

			System.out.print("Digite sua altura: ");
			double altura = sc.nextDouble();

			System.out.println("Meu nome é " + nome + " " + sobrenome + ", tenho " + idade + " anos " + " e tenho " + altura
					+ " cm de altura..");
			
		} catch (InputMismatchException e) {
			System.out.println("Erro de entrada de dados, por favor revise os campos idade e altura!");
		}
		

		sc.close();
	}
}
