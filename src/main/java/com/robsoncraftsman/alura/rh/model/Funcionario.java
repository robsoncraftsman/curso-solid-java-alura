package com.robsoncraftsman.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private final String nome;
	private final String cpf;
	private final Cargo cargo;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public BigDecimal getSalario() {
		return this.salario;
	}

	public LocalDate getDataUltimoReajuste() {
		return this.dataUltimoReajuste;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.salario = novoSalario;
		this.dataUltimoReajuste = LocalDate.now();
	}

}
