package apliccation;

import java.util.Scanner;
import entities.banco;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int conta = sc.nextInt();

        System.out.println("Digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Digite o valor do depósito inicial, sendo opcional (y/n): ");
        char response = sc.next().charAt(0);
        
      

        if (response == 'y') {
            System.out.println("Digite o valor inicial");
            double depositoInicial = sc.nextDouble();
            banco = new banco(conta, nome, depositoInicial);
        } else {
            banco = new banco(conta, nome);
        }

        System.out.println();
        System.out.println(banco.toString());
        
        System.out.println("Deseja realizar um depósito? ");
        double saldo = sc.nextDouble();
        banco.deposito(saldo);
        System.out.println(banco.toString());
        
        sc.nextLine(); // Limpa o buffer
        
        System.out.println("Deseja realizar um saque? ");
        double saque = sc.nextDouble();
        banco.saque(saque);
        System.out.println(banco.toString());
    }
}
