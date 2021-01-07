package com.robsoncraftsman.alura.rh.service.promocao;

import com.robsoncraftsman.alura.rh.ValidacaoException;
import com.robsoncraftsman.alura.rh.model.Cargo;
import com.robsoncraftsman.alura.rh.model.Funcionario;

public class PromocaoService {

	public void promover(final Funcionario funcionario, final boolean metaAtingida) {
		final var cargoAtual = funcionario.getCargo();
		if (Cargo.GERENTE == cargoAtual) {
			throw new ValidacaoException("Gerente não pode ser promovido");
		}

		if (metaAtingida) {
			final var novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionário deve bater a meta para ser promovido");
		}
	}

}
