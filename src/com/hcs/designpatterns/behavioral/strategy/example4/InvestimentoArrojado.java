package com.hcs.designpatterns.behavioral.strategy.example4;

import java.util.Random;

public class InvestimentoArrojado implements Investimento {

	@Override
	public double calculaInvestimento(Conta conta) {
		double chance = new Random().nextDouble();		
		if (chance <= 0.20)
			return conta.getValorInvestido() * 0.05;
		else if ((chance > 0.20) && (chance <= 0.50)) //ou else if (chance < 0.30) ?
			return conta.getValorInvestido() * 0.03;
		else
			return conta.getValorInvestido() * 0.006;
	}	
	
}

