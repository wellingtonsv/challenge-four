package br.com.avalicao.ir.model;

import java.math.BigDecimal;

public abstract class Pessoa {

	public abstract BigDecimal calcular(Pessoa p, BigDecimal salario);
	
}
