package application;

import entities.Conta;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Conta conta;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Account number: ");
        int numeroConta = sc.nextInt();
        System.out.print("Holder Name: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        System.out.print("Is there any initial deposit? (y/n): ");
        char decisao = sc.next().charAt(0);

        if (decisao == 'y'){
            System.out.println();
            System.out.print("Deposit value: ");
            double valorInicial = sc.nextDouble();
            conta = new Conta(numeroConta, nomeTitular, valorInicial);
        } else {
            conta = new Conta(numeroConta, nomeTitular);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double valorDepositado = sc.nextDouble();
        conta.depositar(valorDepositado);

        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double valorSacado = sc.nextDouble();
        conta.sacar(valorSacado);

        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(conta);

        sc.close();
    }
}
