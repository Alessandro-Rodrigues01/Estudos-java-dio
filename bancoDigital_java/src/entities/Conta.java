package entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements Iconta {

	private List<Cliente> listaClintes;

	protected int agencia;
	protected int numero;
	protected double saldo;

	private static int AGENCIA_PADRAO = 1;
	private static int Sequecial = 1;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = Sequecial++;
		this.listaClintes = new ArrayList<>();
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;

	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);

	}

	@Override
	public void adicionarClientes(String nome) {
		Cliente cliente = new Cliente(nome);
		this.listaClintes.add(cliente);
	}

	protected void imprimirInfosComuns() {
		System.out.print(String.format("Nome: %s%n", this.listaClintes));
		System.out.print(String.format("Agencia: %d%n", this.agencia));
		System.out.print(String.format("Numero: %d%n", this.numero));
		System.out.print(String.format("Saldo: %.2f%n", this.saldo));
	}

}
