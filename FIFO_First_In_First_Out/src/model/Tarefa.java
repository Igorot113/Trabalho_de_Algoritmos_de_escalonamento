package model;

public class Tarefa {
	public String nome;

	public Tarefa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Nome: " + getNome();
	}
}
