package com.robsoncraftsman.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;

	public Funcionario(final String nome, final String cpf, final Cargo cargo, final BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo);
		this.salario = salario;
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
		this.dadosPessoais.setCargo(novoCargo);
	}

}
