package com.hcs.designpatterns.behavioral.strategy.example4;

import java.util.Random;

public class InvestimentoModerado implements Investimento {

	@Override
	public double calculaInvestimento(Conta conta) {
		double chance = new Random().nextDouble();
		if (chance <= 0.50)
			return conta.getValorInvestido() * 0.025;
		else
			return conta.getValorInvestido() * 0.007;
	}	
	
}