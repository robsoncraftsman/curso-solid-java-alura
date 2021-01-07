package com.robsoncraftsman.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import com.robsoncraftsman.alura.rh.model.Funcionario;

public class ReajusteService {

	private List<ValidarReajuste> validacoes;

	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));

		final var salarioAtual = funcionario.getSalario();
		final var salarioReajustado = salarioAtual.add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}

}
