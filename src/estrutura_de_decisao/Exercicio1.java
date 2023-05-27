package estrutura_de_decisao;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("QUAL É O MAIOR DOS NÚMEROS?");
        System.out.println("Informe o primeiro número:");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Informe o segundo número:");
        double segundoNumero = scanner.nextDouble();

        if (primeiroNumero == segundoNumero) {
            System.out.println("NÚMEROS IGUAIS!");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("1ºNÚMERO " + primeiroNumero + " É MAIOR QUE 2ºNÚMERO " + segundoNumero);
        } else {
            System.out.println("2ºNÚMERO " + segundoNumero + " É MAIOR QUE 1ºNÚMERO " + primeiroNumero);
        }
        System.out.println("---------------------------------------");

    }
}
