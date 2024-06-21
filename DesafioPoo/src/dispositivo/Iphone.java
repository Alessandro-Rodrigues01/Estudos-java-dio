package dispositivo;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.Camera;
import funcionalidades.Email;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusica;
import funcionalidades.ReprodutorVideo;

public class Iphone implements ReprodutorMusica, ReprodutorVideo, AparelhoTelefonico, NavegadorInternet, Camera, Email {

	@Override
	public void tocar() {
		System.out.println("Tocando música..");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música..");
		
	}
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música " + musica + "...");
		
	}
	
	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo video...");
		
		
	}
	@Override
	public void pausarVideo() {
		System.out.println("Pausando video..");
		
	}

	@Override
	public void selelcionarVideo(String video) {
		System.out.println("Selecionando video " + video + "...");
		
	}
	
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número " + numero + "...");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação ....");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
		
	}
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Carregando pagina na internet " + url +"...");
		
	}

	@Override
	public void adcionarNovaAba() {
		System.out.println("Adcionado nova aba...");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina....");
		
	}
	
	@Override
	public void fotografar() {
		System.out.println("Fotografando..");
		
	}

	@Override
	public void filmar() {
		System.out.println("Filmando...");
		
	}
	
	@Override
	public void enviarEmail() {
		System.out.println("Enviando email..");
		
	}

	@Override
	public void receberEmail() {
		System.out.println("Recebendo email..");
		
	}
	

}
