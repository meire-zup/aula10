package exercicio_de_repeticao_entregar;

import java.util.Scanner;

public class Exercicio2 {
        public static void main(String[] args) {
            System.out.println("---------------------");
            System.out.println(" CALCULANDO A MÉDIA:");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a quantidade de números para calcular a média:");
            int quantidadeDeNumeros = scanner.nextInt();
            double soma = 0;
            for (int i = 1; i <= quantidadeDeNumeros; i++) {
                System.out.println("Informe o "+i+"º número:");
                int numero =scanner.nextInt();
                soma += numero;
            }
            double media = soma/quantidadeDeNumeros;
            System.out.printf("MÉDIA: %,.2f",media);
            System.out.println("---------------------");

        }
    }
