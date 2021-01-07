package com.robsoncraftsman.alura.rh.model;

public class DadosPessoais {

	private String nome;
	private String cpf;
	private Cargo cargo;

	public DadosPessoais(final String nome, final String cpf, final Cargo cargo) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(final String cpf) {
		this.cpf = cpf;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(final Cargo cargo) {
		this.cargo = cargo;
	}

}
