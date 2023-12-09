package entities;

public class Circulo {
	
	private double raio;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double novoRaio) {
		this.raio = novoRaio;
	}
	
	public double calcularArea(){
		    double area = 3.14 * (raio * raio);
		return area;
	}

	public Circulo(double raio) { 
		this.raio = raio;
	}
	public void exibirInformacoes() {
		System.out.println("Valor do raio: " + raio);
		System.out.println("Valor da Área: " + calcularArea());
	}
	
	public static void main(String[] args){
		
		Circulo raio = new Circulo(6); 
		
		System.out.println("Valor do raio antigo: " + raio.getRaio());
		
		raio.setRaio(8);
		
		System.out.println("Valor do raio novo: " + raio.getRaio());
		
		System.out.println("------------");
		raio.exibirInformacoes();
	}
}

