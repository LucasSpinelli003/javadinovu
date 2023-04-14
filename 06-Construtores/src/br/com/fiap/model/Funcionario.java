package br.com.fiap.model;

public class Funcionario {
	
	String nome;
	long matricula;
	Profissao profissao;
	double salario;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public Profissao getProfissao() {
		return profissao;
	}
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
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
	public Funcionario (String nome, long matricula, Profissao profissao, double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.profissao = profissao;
		this.salario = salario;
	}
	public String exibirDados() {
		return nome + "|" + matricula + "|" + profissao + "|" + salario;
	}
	
	
}
