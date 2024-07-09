package agendaContato_map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}

	
	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
			
		}
	}
	
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
		numeroPorNome =	agendaContatoMap.get(nome);
			
		}
		return numeroPorNome;
	}
	
	// metodo main
	public static void main(String[] args) {
	AgendaContatos agendaContatos = new AgendaContatos();
	
	//agendaContatos.exibirContatos();
	agendaContatos.adicionarContato("Alessandro", 999333444);
	agendaContatos.adicionarContato("Pedro", 99935555);
	agendaContatos.adicionarContato("Jose", 999333444);
	agendaContatos.adicionarContato("João", 999333446);
	agendaContatos.adicionarContato("Alessandro", 999333445); //fez o replace mantendo o ultimo elemento
	
	agendaContatos.removerContato("Jose"); // removel o elemento mencionado no parametro
	agendaContatos.exibirContatos();
	
	System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Alessandro"));
	
	}
}
