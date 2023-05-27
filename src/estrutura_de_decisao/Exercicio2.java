package estrutura_de_decisao;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("QUAL É O PRODUTO MAIS BARATO?");

        System.out.println("Informe o preço do produto 1");
        double preco1 = scanner.nextDouble();
        System.out.println("Informe o preço do produto 2");
        double preco2 = scanner.nextDouble();
        System.out.println("Informe o preço do produto 3");
        double preco3 = scanner.nextDouble();

        if(preco1 < preco2 && preco1 < preco3) {
            System.out.println("O produto mais indicado a ser comprado é o produto 1. Boas compras!");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("O produto mais indicado a ser comprado é o produto 2. Boas compras!");
        } else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("O produto mais indicado a ser comprado é o produto 3. Boas compras!");
        } else if (preco1 == preco2 && preco1 == 3 && preco2 == preco3) {
            System.out.println("O preço dos produtos são iguais! ");
        }
        System.out.println("---------------------------------------");

    }

}


