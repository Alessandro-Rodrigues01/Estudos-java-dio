package entities.messenger;

public class MsnMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		
		System.out.println("Enviando mensagem pelo MSN Messenger");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
		
	}

}
