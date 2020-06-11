package br.com.avalicao.controlecalc;

import java.math.BigDecimal;

import br.com.avalicao.ir.model.Pessoa;

public class CalculaImpostoDeRenda {

	public BigDecimal calcular(Pessoa p, BigDecimal salario) {
		BigDecimal resp = validar(p, salario);
		if (resp.compareTo(BigDecimal.ZERO) == 0) {
			return resp;
		}
		return p.calcular(p, salario);
	}

	private BigDecimal validar(Pessoa p, BigDecimal salario) {
		if (null == p) {
			return new BigDecimal(0.0);
		}

		if (null == salario) {
			return new BigDecimal(0.0);
		}

		if (salario.signum() <= 0.0) {
			return new BigDecimal(0.0);
		}

		return salario;
	}
}