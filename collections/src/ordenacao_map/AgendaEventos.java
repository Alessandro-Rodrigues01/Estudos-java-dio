package ordenacao_map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}

	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, evento);
	}

	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}

	public void obterProximoEvento() {
		// Set<LocalDate>dateSet = eventosMap.keySet();
		// Collection<Evento> values = eventosMap.values();
		// eventosMap.get(eventosMap);

		LocalDate dataatual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if (entry.getKey().equals(dataatual) || entry.getKey().isAfter(dataatual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O proximo evento: " + proximoEvento + " acontecera na data " + proximaData);

			}
		}
	}

	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		agendaEventos.adicionarEvento(LocalDate.of(2024, 07, 15), "Evento1", "Atração1");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 07, 8), "Evento2", "Atração2");
		agendaEventos.adicionarEvento(LocalDate.of(2022, 07, 9), "Evento3", "Atração3");
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
		// System.out.println(LocalDate.now());
	}
}
