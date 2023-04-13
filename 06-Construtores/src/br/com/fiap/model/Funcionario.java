package br.com.fiap.model;

public class Funcionario {
	
	String nome;
	long matricula;
	Profissao profissao;
	double salario;
	
	
	public String exibirDados() {
		return nome + matricula + profissao + salario;
	}
	public Funcionario() {
		
	}
	public Funcionario(String nome, long matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	public Funcionario (long matricula) {
		this.matricula = matricula;
		
	}
	
	
}
