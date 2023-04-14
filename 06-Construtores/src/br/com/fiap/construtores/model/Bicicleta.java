package br.com.fiap.construtores.model;

public class Bicicleta {

	private int aro;
	private String modelo;
	private float peso;
	private Fabricante fabricante;
	
	public Bicicleta(String modelo, int aro){
		this.modelo = modelo;
		this.aro = aro;
	}
	
	public Bicicleta(String modelo, int aro, float peso,Fabricante fabricante){
		this(modelo, aro);
		this.peso = peso;
		this.fabricante = fabricante;
	}
 
	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public String retornarDetalhes() {
		return "Tamanho do aro: " + aro + "|" + "Modelo: " + modelo + "|" + "Peso: " + peso ;
	}
}
