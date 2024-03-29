package com.hcs.designpatterns.behavioral.strategy.example3;

public class TesteDeImpostos {

	public static void main(String[] args) {
		ICMS icms = new ICMS();
		ISS iss = new ISS();
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iss);
	}
	
}
