package application;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {

	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

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

		sc.close();
	}
}