package com.robsoncraftsman.alura.rh.service;

import java.math.BigDecimal;

import com.robsoncraftsman.alura.rh.model.Funcionario;

public interface ValidarReajuste {

	void validar(Funcionario funcionario, BigDecimal aumento);

}
