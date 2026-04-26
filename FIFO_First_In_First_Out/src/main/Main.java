package main;

import fifo.Fifo;
import model.Tarefa;

public class Main {
	public static void main(String[] args) {
		Fifo escalonador = new Fifo();
		Tarefa tarefa1, tarefa2, tarefa3;
		tarefa1 = new Tarefa("Processo1");
		tarefa2 = new Tarefa("Processo2");
		tarefa3 = new Tarefa("Processo3");

		escalonador.AdicionarTarefa(tarefa1);
		escalonador.AdicionarTarefa(tarefa2);
		escalonador.AdicionarTarefa(tarefa3);

		while (!escalonador.VerificarFilaVazia()) {
			escalonador.ExecutarTarefa();
		}
	}
}
