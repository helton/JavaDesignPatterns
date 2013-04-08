package com.hcs.designpatterns.behavioral.strategy.example4;

public class InvestimentoConservador implements Investimento {

	@Override
	public double calculaInvestimento(Conta conta) {
		return conta.getValorInvestido() * 0.08;
	}
	
}
