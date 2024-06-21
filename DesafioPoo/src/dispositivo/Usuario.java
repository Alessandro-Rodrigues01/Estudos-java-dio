package dispositivo;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Iphone iphone = new Iphone();
		System.out.println("ESCOLHA UMA FUNCÃO DO IPHONE!");
		System.out.println("----------------------------------------------------------------");
		System.out.println("[DIGITE 1 PARA SELECIONAR MUSICA, 2 TOCAR MUSICA, 3 PAUSAR].");
		System.out.println("[DIGITE 4 PARA SELECIONAR VIDEO, 5 REPRODUZIR, 6 PAUSAR].");
		System.out.println("[DIGITE 7 PARA FAZER LIGAÇÃO, 8 ATENDER, 9 CORREIO DE VOZ].");
		System.out.println("[DIGITE 10 PARA EXIBIR PAGINA NA INTERNET, 11 NOVA ABA, 12 ATUALIZAR PAGINA].");
		System.out.println("[DIGITE 13 PARA FOTOGRAFAR, 14 FILMAR].");
		System.out.println("[DIGITE 15 PARA ENVIAR EMAIL, 16 RECEBER EMAIL].");
		System.out.println("----------------------------------------------------------------");
		System.out.print("DIGITE UMA OPÇÃO DO 1 A 16: ");
		String opcao = sc.next();

		if (opcao.equals("1")) {
			sc.nextLine();
			System.out.print("Esolha uma música: ");
			String music = sc.nextLine();
			iphone.selecionarMusica(music);

		} else if (opcao.equals("2")) {
			iphone.tocar();

		} else if (opcao.equals("3")) {
			iphone.pausar();

		} else if (opcao.equals("4")) {
			sc.nextLine();
			System.out.print("Esolha um video: ");
			String video = sc.nextLine();
			iphone.selelcionarVideo(video);

		} else if (opcao.equals("5")) {
			iphone.reproduzir();

		} else if (opcao.equals("6")) {
			iphone.pausarVideo();

		} else if (opcao.equals("7")) {
			sc.nextLine();
			System.out.print("Digite um numero de telefone: ");
			String tl = sc.nextLine();
			iphone.ligar(tl);
		} else if (opcao.equals("8")) {
			iphone.atender();

		} else if (opcao.equals("9")) {
			iphone.iniciarCorreioVoz();

		} else if (opcao.equals("10")) {
			sc.nextLine();
			System.out.print("Digite um endereço de url: ");
			String inter = sc.nextLine();
			iphone.exibirPagina(inter);
		} else if (opcao.equals("11")) {
			iphone.adcionarNovaAba();

		} else if (opcao.equals("12")) {
			iphone.atualizarPagina();

		} else if (opcao.equals("13")) {
			iphone.fotografar();

		} else if (opcao.equals("14")) {
			iphone.filmar();

		} else if (opcao.equals("15")) {
			iphone.enviarEmail();

		} else if (opcao.equals("16")) {
			iphone.receberEmail();

		}else {
			System.out.println("Opção inválida");
		}

		sc.close();
	}

}
