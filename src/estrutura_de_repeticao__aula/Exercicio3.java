package estrutura_de_repeticao__aula;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("INFORME 5 NÚMEROS PARA SEREM SOMADOS:");
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <6 ; i++) {
            System.out.println("Informe o "+i+"ºnúmero :");
            double numero = scanner.nextDouble();
            soma +=numero;
        }
        System.out.printf("SOMA DOS NÚMEROS: %,.2f\n",soma);
        System.out.println("-------------------------------------");



    }
}
