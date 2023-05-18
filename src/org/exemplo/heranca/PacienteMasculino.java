package org.exemplo.heranca;

import java.time.LocalDateTime;
import java.util.Objects;

public class PacienteMasculino implements IPaciente{

	String cpf;
	String nome;
	float altura;
	float peso;
	int idade;
	LocalDateTime dataAndropausa;
	
	public PacienteMasculino (String cpf, String nome, float altura, float peso, int idade,LocalDateTime dataAndropausa) {
		this.cpf = cpf;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
		this.dataAndropausa = dataAndropausa;
	}
	
	
	public float calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, cpf, dataAndropausa, idade, nome, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PacienteMasculino other = (PacienteMasculino) obj;
		return Float.floatToIntBits(altura) == Float.floatToIntBits(other.altura) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(dataAndropausa, other.dataAndropausa) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Float.floatToIntBits(peso) == Float.floatToIntBits(other.peso);
	}

	@Override
	public String toString() {
		return "PacienteMasculino [cpf=" + cpf + ", nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", idade="
				+ idade + ", dataAndropausa=" + dataAndropausa + "]";
	}

	@Override
	public float calcularMetabolismo() {
		if(this.idade <= 3)
			return (60.9f*this.peso) - 54;
		else if(this.idade >3 && this.idade <= 10)
			return (22.7f*this.peso)+495;
		else if(this.idade > 10 && this.idade <= 18)
			return (17.5f*this.peso)+651;
		else if(this.idade > 18 && this.idade <= 30)
			return (15.3f*this.peso)+679;
		else
			return (11.6f*this.peso)+879;
	}

	
}
