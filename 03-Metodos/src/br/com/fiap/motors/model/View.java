package br.com.fiap.motors.model;

import java.util.Scanner;

public class View {
	//main -> CTRL + espaco
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//Instanciar o Carro
		Carro gol = new Carro();
		
		//Colocar informacoes nos atributos
		gol.ano = 1999;
		gol.modelo = "Gol Bola";
		gol.valor = 15000;
		
		//Calcular a idade do carro
		int i = gol.calcularIdade(2023);
		//Exibir a idade
		System.out.println("Idade do carro: " + i + " anos");
		
		//aumentar valor do carro em 20%
		gol.atualizarValor(0.2);		
		//Exibir o valor do carro 
		System.out.println("O valor atual do carro e de: R$" + gol.valor);
				
		//Calcular a valor do seguro do carro
		double seguro = gol.valorSeguro();
		//Exibir o valor
		System.out.println("O valor do seguro é de: R$" + seguro);
	
		//Parcelas
		System.out.println("Digite a quantidade de parcelas: ");
		int qtdParcelas = leitor.nextInt();
		double parcelas = gol.parcelas(qtdParcelas);
		System.out.println("O valor de cada parcela(" + qtdParcelas + ") é de:" + parcelas);
	}
}