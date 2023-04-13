package b.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.construtores.model.Bicicleta;
import br.com.fiap.construtores.model.Fabricante;



public class Terminal {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Fabricante quico = new Fabricante("mababay", "444-424-2323.0001-00");
		Bicicleta bike = new Bicicleta("Caloi", 20, 20, quico);
		
		quico.setCnpj("444-424-2323.0001-00");
		quico.setNome("mababay");

		bike.setAro(20);
		bike.setFabricante(quico);
		bike.setModelo("Caloi");
		bike.setPeso(20);
		System.out.println(bike.retornarDetalhes() );
		
		System.out.println("Nome do Fabricante: " + " " + bike.getFabricante().getNome() + " " + "||" + " Cnpj do Fabricante: "+ " " + bike.getFabricante().getCnpj());

	}
}
