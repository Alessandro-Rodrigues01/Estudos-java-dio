package entities;

public class Carro extends Veiculo{


public  void ligar () {
	conferereCambio();
	confereCombustivel();
	System.out.println("CARRO LIGAR");
}

private void confereCombustivel() {
	System.out.println("Conferindo combustivel");
}

private void conferereCambio() {
	System.out.println("Confereindo cambio em P");
}
}
