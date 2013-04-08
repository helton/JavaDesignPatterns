package com.hcs.designpatterns.behavioral.strategy.example4;

public class RealizadorDeInvestimentos {

	public void calculaLucroInvestimento (Investimento investimento, Conta conta) {
		conta.adicionaLucroInvestimento(investimento.calculaInvestimento(conta));
		System.out.println("Saldo da conta após cálculo lucro do investimento = " + conta.getSaldo());
	}
	
}
