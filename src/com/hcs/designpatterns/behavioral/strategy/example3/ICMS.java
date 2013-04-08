package com.hcs.designpatterns.behavioral.strategy.example3;

public class ICMS implements Imposto {
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + 50.0;
	}
	
}
