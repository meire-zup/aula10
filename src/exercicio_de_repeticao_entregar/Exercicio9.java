package exercicio_de_repeticao_entregar;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        System.out.println("   CALCULANDO FATORIAL:");
        Scanner scanner = new Scanner(System.in);
        double numero;
        do{
            System.out.println("Informe um número inteiro:");
            numero = scanner.nextDouble();
            if(numero % 1 !=0){
                System.out.println("Valor inválido!");
            }
        } while(numero % 1 != 0);

        double fatorial = numero;
        for (double i = fatorial; i >1 ; i--) {
            fatorial=fatorial*(i-1);
        }
        System.out.printf("FATORIAL DO NÚMERO %d: %,.2f\n", (int) numero, fatorial);
        System.out.println("------------------------------");
    }
}
