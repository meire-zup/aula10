package estrutura_de_repeticao__aula;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("NÚMEROS PARA SEREM SOMADOS:");
        System.out.println("Informa a quantidade de números:");
        int quantidadeDeNumeros = scanner.nextInt();
        int[] numeros = new int[quantidadeDeNumeros];
        int contador =1;
        double soma =0;
        while (contador<=quantidadeDeNumeros){
            System.out.println("Informe um número:");
            double numero = scanner.nextDouble();
            soma=soma+numero;
            contador++;
        }
        System.out.printf("SOMA DOS NÚMEROS: %,.2f\n",soma);
        System.out.println("----------------------------------------------------");


    }
}
