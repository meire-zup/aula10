package estrutura_de_decisao;

import java.util.Scanner;

    public class Exercicio3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-----------------------------------------------");
            System.out.println("VERIFIQUE SE FOI APROVADO OU REPROVADO!");
            System.out.println("Informe a primeira nota:");
            double nota1 = scanner.nextDouble();
            System.out.println("Informe a segunda nota:");
            double nota2 = scanner.nextDouble();
            double media = (nota1+nota2)/2;
            if (media>=7 && media <10) {
                System.out.printf("APROVADO com média %.2f\n",media);
            } else if (media >=0 && media < 7 ) {
                System.out.printf("REPROVADO com média %.2f\n",media);
            } else if (media == 10) {
                System.out.printf("APROVADO COM DISTINÇÃO com média %.2f\n",media);
            } else {
                System.out.println("Favor informar valor válido de nota (0 a 10)");
            }
            System.out.println("-----------------------------------------------");

        }
}

