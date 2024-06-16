package application;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Autodromo {

	public static void main(String[] args) {
		Carro jeep  = new Carro();
		jeep.setChassi("888888");
		jeep.ligar();
		
		Moto Cb300 = new Moto();
		Cb300.setChassi("999999");
		Cb300.ligar();
		/*
		Veiculo coringa = jeep;
		coringa.ligar();
*/
	}

}
