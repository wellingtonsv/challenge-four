package br.com.avalicao.ir.model;

import java.math.BigDecimal;

public class PessoaFisica extends Pessoa {

	private BigDecimal aliquotaImpostoCPF = new BigDecimal(22.50);

	@Override
	public BigDecimal calcular(Pessoa p, BigDecimal salario) {
		BigDecimal mult = (salario.multiply(aliquotaImpostoCPF));
		BigDecimal resp = mult.divide(new BigDecimal(100));
		return resp;
	}
}