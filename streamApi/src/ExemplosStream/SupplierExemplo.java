package ExemplosStream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemplo {
	public static void main(String[] args) {
		Supplier<String> saudacao = ()-> "Olá,seja bem vindo(a)";
		
		List<String> listSaudacao = Stream.generate(saudacao)
				.limit(5)
				.toList();
		
		//imprimir as saldações geradas
		listSaudacao.forEach(n -> System.out.println(n));
		//listSaudacao.forEach( System.out::println); //reference
				
	}

}
