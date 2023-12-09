package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantify) { // e vir no atributo quantify e alterar o valor do atributo dele
		// como diferenciar o atributo da classe com o parametro do método? usamos o this.
		// usando o this.quantity estamos sendo explicito ao especificar que queremos acessar o atributo da classe, e não o parametro
		
		this.quantity += quantity; // o atributo recebe ele + o valor que chegou do parametro, adicionado		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return getName()
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, total: $ "
			+ String.format("%.2f", totalValueInStock());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

