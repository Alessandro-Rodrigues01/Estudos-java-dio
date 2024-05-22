package tipos_variaveis;

public class TiposVariaveis {
	public static void main(String[] args) {
		// tipos de variaveis
			String nome = "Alesssandro Rodrigues";
			char sexo = 'M';
			boolean fuiParaMarte = false;
			long cpf = 333166688-04;
			double salarioMinimo = 2500;
			
			short numeroCurto = 1;
			int numeroNormal = numeroCurto;
			short numeroCurto2 =  (short) numeroNormal;
			// por conta da tipagem forte do java short não pode receber a 
			// variavel int, somente por meio de cast que garante que não vai
			// ultrapassar o limite de memoria.
			
			System.out.println(nome);
			System.out.println(numeroCurto2);
			
			
			//operadores ternarios
			
			int a,b;
			a = 6;
			b = 6;
			 String resultado = a == b ? "verdadeiro" : "falso";
			 System.out.println(resultado);
			

		}
}
