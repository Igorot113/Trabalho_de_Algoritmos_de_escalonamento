package main;

import lifo.LIFO;
import model.Tarefa;

public class Main {
	public static void main(String[] args) {
		Tarefa tarefa1, tarefa2, tarefa3;
		LIFO escalonador = new LIFO();
		tarefa1 = new Tarefa("Processo1");
		tarefa2 = new Tarefa("Processo2");
		tarefa3 = new Tarefa("Processo3");

		escalonador.AdicionandoTarefas(tarefa1);
		escalonador.AdicionandoTarefas(tarefa2);
		escalonador.AdicionandoTarefas(tarefa3);

		while (!escalonador.VerificarPilhaSeEstaVazia()) {
			escalonador.ExecutandoTarefa();
			escalonador.PosExecucao();
		}
	}
}
