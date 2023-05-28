package exercicio_de_repeticao_entregar;

import java.util.Scanner;

    public class Exercicio8 {
        public static void main(String[] args) {
            System.out.println("----------------------------------------");
            System.out.println("SOMANDO OS 50 PRIMEIROS NÚMEROS ÍMPARES:");
            int soma = 0;
            int quantidadeDeNumerosImpares = 50;
            int numerosImpares = 0;
            int numero = 1;
            while (numerosImpares<quantidadeDeNumerosImpares){
                if(numero % 2 != 0){
                    soma = soma + numero;
                    numerosImpares++;
                }
                numero++;
            }
            System.out.printf("SOMA DOS 50 NÚMEROS ÍMPARES: %d\n",soma);
            System.out.println("----------------------------------------");

        }
}
