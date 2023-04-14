package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.construtores.model.Bicicleta;
import br.com.fiap.construtores.model.Fabricante;
import br.com.fiap.model.Funcionario;
import br.com.fiap.model.Profissao;



public class Terminal {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Profissao p = new Profissao("Programador");
		Funcionario f = new Funcionario("Caslu", 10, p, 1550);
		Fabricante quico = new Fabricante("mababay", "444-424-2323.0001-00");
		Bicicleta bike = new Bicicleta("Caloi", 20, 20, quico);
		
		quico.setCnpj("444-424-2323.0001-00");
		quico.setNome("mababay");
		bike.setAro(20);
		bike.setFabricante(quico);
		bike.setModelo("Caloi");
		bike.setPeso(20);
		f.setNome("Caslu");
		f.setMatricula(10);
		f.setProfissao(p);
		f.setSalario(1550);
		
		String nDetalhes = f.exibirDados();
		
		String detalhes = bike.retornarDetalhes() + "|" + f.getProfissao().getNome();
		
		System.out.println(detalhes );
		
		System.out.println("Nome do Fabricante: " + " " + bike.getFabricante().getNome() + " " + "||" + " Cnpj do Fabricante: "+ " " + bike.getFabricante().getCnpj());
		
		System.out.println(nDetalhes);
		
		System.out.println("Nome da Profissão: " + "|" +f.getProfissao().getNome()+ "|");

		
		
		
		
		
	}
}
