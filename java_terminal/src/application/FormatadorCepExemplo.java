package application;

public class FormatadorCepExemplo {

	public static void main(String[] args) {
		try {
			String cepFormtado  = formatarCep("18160000");
			System.out.println(cepFormtado);
		} catch (CepInvalidoException e) {
			System.out.println("O cep não corresponde com a regra de negocio");
		}
		
	}
	static String formatarCep(String cep) throws CepInvalidoException {
		if (cep.length() != 8) {
			throw new CepInvalidoException();
			
			
		}
		return "99.99.999";
	}

}
