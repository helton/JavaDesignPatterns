package com.hcs.designpatterns.behavioral.strategy.example4;

public class TesteDeInvestimentos {

	public static void main(String[] args) {
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();		
		realizadorDeInvestimentos.calculaLucroInvestimento(new InvestimentoConservador(), new Conta(10000.0, 5000.0));
		realizadorDeInvestimentos.calculaLucroInvestimento(new InvestimentoModerado(),    new Conta(10000.0, 5000.0));
		realizadorDeInvestimentos.calculaLucroInvestimento(new InvestimentoArrojado(),    new Conta(10000.0, 5000.0));		
	}
}
