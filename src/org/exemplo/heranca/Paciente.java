package org.exemplo.heranca;

import java.util.Objects;

public abstract class Paciente {

	String cpf;
	String nome;
	float altura;
	float peso;
	int idade;
	
	public Paciente(String cpf, String nome, float altura, float peso, int idade) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Paciente [cpf=" + cpf + ", nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", idade=" + idade
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	
	public float calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}
	
	public abstract float calcularMetabolismo();
	
}
