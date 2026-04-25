package model;

public class Tarefa {
	public String nome;
	public boolean finalizado;

	public Tarefa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public String toString() {
		return "Nome: " + getNome();
	}
}
