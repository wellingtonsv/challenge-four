package br.com.avalicao.ir.model;

import java.math.BigDecimal;

public class PessoaJuridica extends Pessoa {

	private BigDecimal aliquotaImpostoCnpj = new BigDecimal(27.50);

	@Override
	public BigDecimal calcular(Pessoa p, BigDecimal salario) {
		BigDecimal mult = (salario.multiply(aliquotaImpostoCnpj));
		BigDecimal resp = mult.divide(new BigDecimal(100));
		return resp;
	}
}