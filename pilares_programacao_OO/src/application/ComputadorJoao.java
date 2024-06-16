package application;

import java.util.Scanner;

import entities.messenger.FacebookMessenger;
import entities.messenger.MsnMessenger;
import entities.messenger.ServicoMensagemInstantanea;
import entities.messenger.TelegramMessenger;

public class ComputadorJoao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ServicoMensagemInstantanea smi = null;

		System.out.print("Escolha uma rede social [MSN/FCB/TLG]: ");
		String appEscolhido = sc.next();
		if (appEscolhido.equals("MSN") || appEscolhido.equals("msn")) {
			smi = new MsnMessenger();
		} else if (appEscolhido.equals("FCB") || appEscolhido.equals("fcb")) {
			smi = new FacebookMessenger();
		} else if (appEscolhido.equals("TLG") || appEscolhido.equals("tlg")) {
			smi = new TelegramMessenger();

		} else {
			System.out.println("Opção inválida");
		}

		smi.enviarMensagem();
		smi.receberMensagem();

		sc.close();
	}

}
