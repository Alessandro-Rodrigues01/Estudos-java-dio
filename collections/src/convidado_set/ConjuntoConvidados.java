package convidado_set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	public Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoPararemover = null;
		
		for (Convidado c: convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoPararemover = c;
				break;
			}
			
		}
		convidadoSet.remove(convidadoPararemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
		
	}
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro de set convidados ");
		conjuntoConvidados.adicionarConvidado("Convidado 01", 122);
		conjuntoConvidados.adicionarConvidado("Convidado 02", 125);
		conjuntoConvidados.adicionarConvidado("Convidado 03", 124);
		conjuntoConvidados.adicionarConvidado("Convidado 04", 125); //duplicidade teste
		
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(125);
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro de set convidados ");
		
		conjuntoConvidados.exibirConvidados();
		
	} 
	
}
