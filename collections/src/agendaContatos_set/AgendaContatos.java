package agendaContatos_set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> listcontato;

	public AgendaContatos() {
		super();
		this.listcontato = new HashSet<>();
	}

	public void adicionarContato(String nome, int ddd, long numero) {
		listcontato.add(new Contato(nome, ddd, numero));
	}
	
	
	public void exibirContatos() {
		System.out.println(listcontato);
	}
	
	public Set<Contato>  pesquisarPorNome(String nome) {
		
		Set<Contato> contatoPorNome = new HashSet<>();
		for (Contato c : listcontato) {
			if (c.getNome().startsWith(nome)) {
				contatoPorNome.add(c);
				
			}
			
		}
		return contatoPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int ddd, long novoNumero) {
		
		Contato contatoAtualizado = null;
		for (Contato c : listcontato) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumeroTelefone(novoNumero);
				contatoAtualizado = c;
				break;
				
			}
			
		}
		return contatoAtualizado;
		
		
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Alessandro", 15, 996785598);
		agendaContatos.adicionarContato("Pedro", 15, 996785590);
		agendaContatos.adicionarContato("Julia", 15, 996785598); // numero repetido não adiciona
		
		agendaContatos.exibirContatos();
	}
}
