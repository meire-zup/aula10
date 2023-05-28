package exercicio_de_repeticao_entregar;

import java.util.Scanner;

    public class Exercicio4 {
            public static void main(String[] args) {
                System.out.println("-----------------------------------");
                System.out.println("SOMANDO NÚMEROS POSITIVOS:");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe a quantidade de números:");
                int quantidadeDeNumeros = scanner.nextInt();
                double soma = 0;

                for (int i = 1; i <=quantidadeDeNumeros ; i++) {
                    System.out.println("Informe um número positivo:");
                    double numero = scanner.nextDouble();
                    if(numero >0){
                        soma +=numero;
                    } else {
                        System.out.println("O número informado não é positivo!");
                        i--;
                    }
                }
                System.out.printf("SOMA: %.2f\n",soma);
                System.out.println("-----------------------------------");

            }
        }
