package br.com.fiap.motors.model;

public class Carro {

	//Atributos
	String modelo;
	
	int ano;
	
	double valor;
	
	//Metodos
	//idade calcularIdade(ano atual)
	public int calcularIdade(int anoAtual) {
		//Calcular a idade
		int idade = anoAtual - ano;
		//Retornar a idade
		return idade;
	}
	
	//atualizar o valor do carro
	void atualizarValor(double porcentagem) {
		valor *= (1 + porcentagem);
	}
	
	//criar método que calcula e retornar valor do seguro
	//seguro é 5% porcento do valor do carro
	public double valorSeguro() {
		double porcentagem = valor * 0.05;
		return porcentagem;
	}
	
	//cria um método que recebe a quantidade de parcelas, calcula e retorna
	//o valor da parcela
	public double parcelas(int parcelas) {
		double calculo = valorSeguro() / parcelas;
		return calculo;
	}
}