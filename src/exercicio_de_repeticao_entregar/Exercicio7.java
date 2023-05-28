package exercicio_de_repeticao_entregar;

import java.util.Scanner;

public class Exercicio7 {
        public static void main(String[] args) {
            System.out.println("-----------------------------------");
            System.out.println("VERIFICANDO SE O NÚMERO É PRIMO:");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe um número inteiro:");
            int numero = scanner.nextInt();
            for (int i = 2; i <numero ; i++) {
                if(numero%i == 0){
                    System.out.println("O número "+numero+" não é primo.");
                    break;
                } else if ((!(numero%i == 0)) && (numero==i+1) ){
                    System.out.println("O número "+numero+" é primo.");
                    i++;
                }
            }
            System.out.println("-----------------------------------");
        }
    }
