package com.robsoncraftsman.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import com.robsoncraftsman.alura.rh.model.Funcionario;

public class ReajusteService {

	private List<ValidarReajuste> validacoes;

	public void reajustarSalarioDoFuncionario(final Funcionario funcionario, final BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));

		final var salarioAtual = funcionario.getSalario();
		final var salarioReajustado = salarioAtual.add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}

}
