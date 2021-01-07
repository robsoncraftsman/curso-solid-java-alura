package com.robsoncraftsman.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.robsoncraftsman.alura.rh.ValidacaoException;
import com.robsoncraftsman.alura.rh.model.Funcionario;

public class ValidarPeriodoReajuste implements ValidarReajuste {

	@Override
	public void validar(final Funcionario funcionario, final BigDecimal aumento) {
		final var dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		final var dataAtual = LocalDate.now();
		final var mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		if (mesesDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser no mínimo de 6 meses");
		}
	}

}
