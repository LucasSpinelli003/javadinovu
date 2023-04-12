
package br.com.fiap.model.veiculos;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Cor collor = new Cor();
		
		
		Carro porshe = new Carro() ;
	
		
		collor.setR(8);
		collor.setG(1);
		collor.setB(2);
		collor.setNome("Blue");
		
		
		// collor.alterarCor(0, 0, 0, null);
	
		
		
		porshe.setModelo("Porshe 911");
		porshe.setAnoFabricacao(1999);
		porshe.setCor(collor);
		porshe.setMotor(1);
		porshe.setPlaca("RGB1999");
		porshe.setQuantidadeLugares(5);
		porshe.setQuantidadePortas(2);
		
		System.out.println(porshe.getModelo() +
				" " + porshe.getMotor() +
				" " + porshe.getAnoFabricacao() +
				" " + porshe.getComprimento() +
				" " + porshe.getPlaca() +
				" " + porshe.getQuantidadeLugares() +
				" " + porshe.getQuantidadePortas() +
				" " + porshe.getCor()
		);
		
	}
	
	
	
	
	
}
