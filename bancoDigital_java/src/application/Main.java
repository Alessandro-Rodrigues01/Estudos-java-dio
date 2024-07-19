package application;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		cc.depositar(500);
		cc.transferir(500, cp);
		cp.sacar(250);

		cc.adicionarClientes("alessandro");
		cp.adicionarClientes("Ana");

		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
