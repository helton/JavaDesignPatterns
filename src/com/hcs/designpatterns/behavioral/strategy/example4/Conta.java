package com.hcs.designpatterns.behavioral.strategy.example4;

public class Conta {

	private double saldo;	
	private double valorInvestido;
	
	public Conta(double saldo, double valorInvestido) {
		this.saldo = saldo;
		this.valorInvestido = valorInvestido;
	}
	
	public double getSaldo() {
		return saldo;
	}	
	
	public double getValorInvestido() {
		return valorInvestido;
	}
	
	public void adicionaLucroInvestimento(double lucroInvestimento) {
		this.saldo += lucroInvestimento * 0.75; //25% é de impostos
	}
	
}
