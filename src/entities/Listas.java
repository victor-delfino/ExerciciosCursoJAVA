package entities;

public class Listas {
	private int id;
	private String nome;
	private double salario;
	
	public Listas(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void aumento(double salario) {
		this.salario = salario + (salario* 0.10);
	}
	
	
}
