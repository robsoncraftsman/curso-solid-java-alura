package com.robsoncraftsman.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;

	public Funcionario(final String nome, final String cpf, final Cargo cargo, final BigDecimal salario) {
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

	public void atualizarSalario(final BigDecimal novoSalario) {
		this.salario = novoSalario;
		this.dataUltimoReajuste = LocalDate.now();
	}

	public void promover(final Cargo novoCargo) {
		this.cargo = novoCargo;
	}

}
