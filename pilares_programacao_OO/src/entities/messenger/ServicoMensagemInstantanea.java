package entities.messenger;

public abstract class ServicoMensagemInstantanea {
	


protected void validarConectadoInternet() {
	System.out.println("Validando se  está conectado a internet");
}

protected void salvarHistoricoMensagem() {
	System.out.println("Salvando o histórico da mensagem");
}

public abstract void enviarMensagem();
public abstract void receberMensagem();
}
