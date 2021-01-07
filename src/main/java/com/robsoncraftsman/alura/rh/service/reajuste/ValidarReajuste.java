package com.robsoncraftsman.alura.rh.service.reajuste;

import java.math.BigDecimal;

import com.robsoncraftsman.alura.rh.model.Funcionario;

public interface ValidarReajuste {

	void validar(final Funcionario funcionario, final BigDecimal aumento);

}
