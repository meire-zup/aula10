package exercicio_de_repeticao_entregar;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println(" MOSTRANDO O MENOR E O MAIOR VALOR:");
        Scanner scanner = new Scanner(System.in);
        double menorValor = Integer.MAX_VALUE;
        double maiorValor = Integer.MIN_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o " + i + "º número:");
            double numero = scanner.nextDouble();
            if(numero < menorValor) {
                menorValor = numero;
            }
            if(numero > maiorValor) {
                maiorValor = numero;
            }
        }
        System.out.printf("MENOR VALOR: %,.2f\n",menorValor);
        System.out.printf("MAIOR VALOR: %,.2f\n",maiorValor);
        System.out.println("-----------------------------------");

    }
}
