package com.hcs.designpatterns.behavioral.strategy.example3;

public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
	
}
