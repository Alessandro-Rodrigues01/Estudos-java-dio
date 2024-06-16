package entities.messenger;

public abstract class ServicoMensagemInstantanea {
	
/*

private void validarConectadoInternet() {
	System.out.println("Validando se  está conectado a internet");
}

private void salvarHistoricoMensagem() {
	System.out.println("Salvando o histórico da mensagem");
}
*/
public abstract void enviarMensagem();
public abstract void receberMensagem();
}
