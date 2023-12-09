package entities;

public class Livros {
	
	private String titulo;
	private int ano;
	private String autor;
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String novoTitulo){
		this.titulo = novoTitulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int novoAno) {
		this.ano = novoAno;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String novoAutor) {
		this.autor = novoAutor;
	}
	
	public void exibirInformacoes(){
		    System.out.println("Título: " + titulo);
		    System.out.println("Ano: " + ano);
		    System.out.println("Autor: " + autor);
	}

	public Livros(String titulo, int ano, String autor) { 
		this.ano = ano;
		this.autor = autor;
		this.titulo = titulo;
	}
	
	public static void main(String[] args){
		
		Livros pessoa1 = new Livros("João e o Pé de Feijão",1807,"Benjamin Tabart"); 
		
		System.out.println("Título antigo: " + pessoa1.getTitulo());
		
		pessoa1.setTitulo("João & Maria");
		
		System.out.println("Ano antigo: " + pessoa1.getAno());
		
		pessoa1.setAno(1956);
		
		System.out.println("Autor antigo: " + pessoa1.getAutor());
		
		pessoa1.setAutor("Cleiton Abreu");
		System.out.println("------------");
		pessoa1.exibirInformacoes();
	}
}

