package br.com.fiap.model.veiculos;

public class Cor {
	
	private String nome;
	private int r;
	private int g;
	private int b;

	
	public void alterarCor(int rNovo, int gNovo, int bNovo,String nomeNovo) {
		r = rNovo;
		g = gNovo;
		b = bNovo;
		nome = nomeNovo;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getR() {
		return r;
	}


	public void setR(int r) {
		this.r = r;
	}


	public int getG() {
		return g;
	}


	public void setG(int g) {
		this.g = g;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}

	
	
}
