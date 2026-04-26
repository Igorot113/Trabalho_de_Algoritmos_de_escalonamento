package fifo;

import java.util.LinkedList;
import java.util.Queue;

import model.Tarefa;

public class Fifo {
	Queue<Tarefa> fila = new LinkedList<>();
	Tarefa primeiroDaFila;

	public void AdicionarTarefa(Tarefa tarefa) {
		fila.add(tarefa);
		System.out.println("Tarefa adicionado com sucesso!");
	}

	public void ExecutarTarefa() {
		primeiroDaFila = fila.peek();
		System.out.printf("Executando a primeira entrada da fila, tarefa de nome: %s.\n", primeiroDaFila.getNome());
		System.out.println("Tarefa " + primeiroDaFila.getNome() + " finalizada.\n");
		fila.remove();
	}

	public boolean VerificarFilaVazia() {
		return fila.isEmpty();
	}

}
