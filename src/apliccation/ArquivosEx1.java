package apliccation;


import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException; // vai tratar a entrada e saída, acredito

public class ArquivosEx1 {

	public static void main(String[] args) {
		
		int numeropalavras = 0;
		int numerobytes = 0;
		int numerolinhas = 0;
		
		try {
			FileReader entrada = new FileReader("C:/Users/Claudia/Documents/TesteArquivo/arquivo.txt"); // le caracteres
			BufferedReader bufferedReader = new BufferedReader(entrada); // usamos o buffered para acelerar a leitura do filereader
			FileWriter saida = new FileWriter("C:/Users/Claudia/Documents/TesteArquivo/novoarquivo.txt");
			
			String linha;
			while((linha = bufferedReader.readLine()) != null) {
				String [] palavras = linha.split(" ");
				numeropalavras += palavras.length;
				numerobytes += linha.getBytes().length; // comando para calcular o total de bytes na linha por iteração
				numerolinhas ++;
				
                saida.write(linha + System.lineSeparator());
			}
			bufferedReader.close();
			saida.close();
		} catch (IOException e) {
			System.out.println("Erro ao tentar ler o arquivo: " + e.getMessage()); // para realizar a mensagem do sysout
		}
		System.out.println("Número de palavras: " + numeropalavras);
		System.out.println("Número de bytes: " + numerobytes);
		System.out.println("Número de linhas: " + numerolinhas);
	}

}
