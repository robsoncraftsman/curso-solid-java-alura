package com.robsoncraftsman.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.robsoncraftsman.alura.rh.ValidacaoException;
import com.robsoncraftsman.alura.rh.model.Funcionario;

public class ReajusteService {

	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		final var salarioAtual = funcionario.getSalario();
		final var percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		final var salarioReajustado = salarioAtual.add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}

}
