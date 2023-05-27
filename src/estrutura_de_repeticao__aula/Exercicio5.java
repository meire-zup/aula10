package estrutura_de_repeticao__aula;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------");
        System.out.println("ZERANDO A FILA DO BANCO:");
        System.out.println("Informe a quantidade de pessoas na fila:");
        int quantidadeDePessoasNaFila = scanner.nextInt();
        for (int i = 1; i <=quantidadeDePessoasNaFila; i++) {
            System.out.println("A "+i+"º pessoa foi atendida. Próximo, por gentileza.");
        }
        System.out.println("Fila do bAnco zerada com sucesso!");
        System.out.println("FIM");
        System.out.println("-----------------------------------------------------");

    }
}
