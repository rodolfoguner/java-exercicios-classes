package br.com.fai.models;

public abstract class Animal {

	private static int animalsIds = 1;

	private int id;
	private String nome;
	
	public Animal () {}
	
	public Animal (String nome) {
		this.id = animalsIds;
		this.nome = nome;
		Animal.animalsIds += 1;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
