package application;

import entities.messenger.FacebookMessenger;
import entities.messenger.MsnMessenger;
import entities.messenger.ServicoMensagemInstantanea;
import entities.messenger.TelegramMessenger;

public class ComputadorJoao  {

	public static void main(String[] args) {
		
		
		MsnMessenger msn = new MsnMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		System.out.println("MSN:");
		System.out.println();
		
		
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		System.out.println("FACEBOOK:");
		System.out.println();
		
		
		TelegramMessenger tlg = new TelegramMessenger();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		System.out.println("TELEGRAM:");
		System.out.println();
		
		//validarConectadoInternet();
		
		
	}

}
