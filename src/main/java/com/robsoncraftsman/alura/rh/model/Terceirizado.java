package com.robsoncraftsman.alura.rh.model;

public class Terceirizado {

	private DadosPessoais dadosPessoais;
	private String empresa;

	public Terceirizado(final String nome, final String cpf, final Cargo cargo, final String empresa) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo);
		this.empresa = empresa;
	}

	public String getNome() {
		return this.dadosPessoais.getNome();
	}

	public String getCpf() {
		return this.dadosPessoais.getCpf();
	}

	public Cargo getCargo() {
		return this.dadosPessoais.getCargo();
	}

	public String getEmpresa() {
		return this.empresa;
	}

}
