package exercicio_de_repeticao_entregar;

import java.util.Scanner;

    public class Exercicio6 {
            public static void main(String[] args) {
                System.out.println("-------------------------------------------------------");
                System.out.println("SOMANDO NÚMEROS ÍMPARES EM UM INTERVALO:");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe o valor do primeiro intervalo:");
                int intervalo1 = scanner.nextInt();
                int intervalo2;
                do {
                    System.out.println("Informe o valor do segundo intervalo:");
                    intervalo2 = scanner.nextInt();
                    if(intervalo2<intervalo1){
                        System.out.println("Segundo intervalo não pode ser menor que primeiro.");

                    }
                } while (intervalo2<intervalo1);

                int soma = 0;

                for (int i = intervalo1; i <= intervalo2 ; i++) {
                    if( !(i%2==0) ){
                        soma+=i;
                    }
                }
                System.out.printf("SOMA DOS NÚMEROS ÍMPARES DO INTERVALO [%d - %d]: %d\n",intervalo1,intervalo2,soma);
                System.out.println("-------------------------------------------------------");

            }
        }
