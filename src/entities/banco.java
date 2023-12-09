package entities;

public class banco {
	private int conta;
	private String nome;
	private double saldo;

	public banco(int conta, String nome, double depositoinicial) {
		this.conta = conta;
		this.nome = nome;
		deposito(depositoinicial);
	}
	public banco(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
		
	}

	public int getConta() {
		return conta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double saldo) {
		if(saldo > 0) {
			this.saldo += saldo;
		}
	}
	public void saque(double valor) {
		if(valor > 0 && saldo >= valor) {
			this.saldo -= valor + 5;
		}else {
			System.out.println("Saldo insuficiente para realizar o saque.");
		}
	}
	 public String toString() {
	        return "Conta: " + conta + "\nNome: " + nome + "\nSaldo: " + saldo;
	    }
}
