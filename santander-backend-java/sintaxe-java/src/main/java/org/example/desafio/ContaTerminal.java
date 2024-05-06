package org.example.desafio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        ContaBanco conta = new ContaBanco();
        System.out.println("Por favor, digite o número!");
        conta.setNumero(scanner.nextInt());

        System.out.println("Por favor, digite o número da Agência!");
        conta.setAgencia(scanner.next());

        System.out.println("Digite o nome");
        conta.setNomeCliente(scanner.next());

        System.out.println("Digite o saldo");
        conta.setSaldo(scanner.nextDouble());

        String resposta = "Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque";
        System.out.println(resposta);

    }
}
