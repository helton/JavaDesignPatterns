package com.hcs.designpatterns.behavioral.strategy.example3;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		System.out.println(imposto.calcula(orcamento));
	}
	
}
