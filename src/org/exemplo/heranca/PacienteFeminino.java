package org.exemplo.heranca;

import java.util.Date;
import java.util.Objects;

public class PacienteFeminino implements IPaciente {
	String cpf;
	String nome;
	float altura;
	float peso;
	int idade;

	Date dataGestacao;
	Date dataMenarca;
	
	public PacienteFeminino (String cpf, String nome, float altura, float peso, int idade, Date dataGestacao, Date dataMenarca) {
		this.cpf = cpf;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
		this.dataGestacao = dataGestacao;
		this.dataMenarca = dataMenarca;
	}
		
	public float calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}
	
	public float calcularMetabolismo() {
		if(this.idade <= 3)
			return (61*this.peso) - 51;
		else if(this.idade >3 && this.idade <= 10)
			return (22.5f*this.peso)+499;
		else if(this.idade > 10 && this.idade <= 18)
			return (12.2f*this.peso)+746;
		else if(this.idade > 18 && this.idade <= 30)
			return (14.7f*this.peso)+496;
		else
			return (8.7f*this.peso)+829;
	}

	@Override
	public String toString() {
		return "PacienteFeminino [cpf=" + cpf + ", nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", idade="
				+ idade + ", dataGestacao=" + dataGestacao + ", dataMenarca=" + dataMenarca + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, cpf, dataGestacao, dataMenarca, idade, nome, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PacienteFeminino other = (PacienteFeminino) obj;
		return Float.floatToIntBits(altura) == Float.floatToIntBits(other.altura) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(dataGestacao, other.dataGestacao) && Objects.equals(dataMenarca, other.dataMenarca)
				&& idade == other.idade && Objects.equals(nome, other.nome)
				&& Float.floatToIntBits(peso) == Float.floatToIntBits(other.peso);
	}

	
	
}
