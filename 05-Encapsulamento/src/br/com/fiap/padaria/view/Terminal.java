package br.com.fiap.padaria.view;

import java.util.Scanner;

import br.com.fiap.padaria.model.Produto;

public class Terminal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Produto p = new Produto();
		
		p.setNome("DVD");
		p.setId(7);
		p.setPrecoCusto(100);
		p.setPrecoVenda(150);
		p.setPromocao(true);
		p.setQuantidade(10);
		p.calcularLucro();
		System.out.println("Digite o valor de DVD´s a ser adicionado: ");
		int valorNuevo = leitor.nextInt();
		p.atualizarEstoque(valorNuevo);
		
		
		
		
	System.out.println("Id: " + p.getId() + ", " 
	+ "Nome: "+ p.getNome() + " ," +
			"Preco de Custo: " + p.getPrecoCusto() + " ," +
	"Preco de Venda: " + p.getPrecoVenda() + ", " + 
			"Quantidade: " + p.getQuantidade() + ", " +
	" Promocao: " + p.getPromocao());
	
	double lucro = p.calcularLucro();
	
	System.out.println("Lucro final:" + lucro);
	}
	
	
}
