package lifo;

import java.util.Stack;

import model.Tarefa;

public class LIFO {
	Stack<Tarefa> pilha = new Stack<>();
	Tarefa tarefa, tarefaDoTopo;

	public void AdicionandoTarefas(Tarefa tarefa) {
		pilha.push(tarefa);
		System.out.println("Tarefa foi adicionando com sucesso!");
	}

	public void ExecutandoTarefa() {
		tarefaDoTopo = pilha.peek();
		System.out.printf("A tarefa: %s está no topo da pilha e vai ser executado.\n", tarefaDoTopo.getNome());
	}

	public void PosExecucao() {
		System.out.printf("A tarefa: %s foi finalizada.\n", tarefaDoTopo.getNome());
		pilha.pop();
	}

	public boolean VerificarPilhaSeEstaVazia() {
		return pilha.empty();
	}
}
