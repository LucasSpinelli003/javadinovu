package br.com.fiap.construtores.model;

public class Bicicleta {

	private int aro;
	private String modelo;
	private float peso;
	private Fabricante fabricante;
	
	Bicicleta(String modeloBicicleta){
		modelo = modeloBicicleta;
	}
	
	Bicicleta(String modeloBicicleta, int aro, String modelo, float peso,Fabricante fabricante){
		this(modeloBicicleta);
		this.aro = aro;
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
		return aro + "|" + "|" + modelo + "|" + peso ;
	}
}
