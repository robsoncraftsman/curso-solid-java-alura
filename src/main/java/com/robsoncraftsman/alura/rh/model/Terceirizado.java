package com.robsoncraftsman.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado extends Funcionario {

	private String empresa;

	public Terceirizado(final String nome, final String cpf, final Cargo cargo, final BigDecimal salario, final String empresa) {
		super(nome, cpf, cargo, salario);
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return this.empresa;
	}

}
