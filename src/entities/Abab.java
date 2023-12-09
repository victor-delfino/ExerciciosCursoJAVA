package entities;

public class Abab {
	private String nome;
	private int idade;
	private double salario;

	public Abab(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void aumento(double salario) {
		this.salario += salario;
	}

	public void imposto(double salario) {
		this.salario -= salario ;
	}
	public String toString() {
		return "nome: " + nome + "\nidade: " + idade + "\nsalário: " + salario;
	}
}
