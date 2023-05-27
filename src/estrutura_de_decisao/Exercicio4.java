package estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double salario;
            do {
                System.out.println("VERIFIQUE SEU REAJUSTE!");
                System.out.println("Informe o seu salário:");
                salario = scanner.nextDouble();
                if(salario<=0){
                    System.out.println("Favor informar salário maior que R$ 0,00.");
                }
            }      while (salario<=0);

            int taxaPercentualDeAumento;
            double valorDoAumento;
            double novoSalario;
            if (salario<=280) {
                taxaPercentualDeAumento = 20;
            } else if (salario > 280 && salario <= 700) {
                taxaPercentualDeAumento = 15;
            } else if (salario > 700 && salario <= 1500) {
                taxaPercentualDeAumento = 10;
            } else {
                taxaPercentualDeAumento = 5;
            }
            valorDoAumento = salario * taxaPercentualDeAumento /100;
            novoSalario = salario + valorDoAumento;
            System.out.println("-----------------------------------");
            System.out.println("RELATÓRIO SALARIAL:");
            System.out.printf("Salário antes do reajuste: %,.2f\n",salario);
            System.out.printf("Percentual de aumento aplicado: %d%%\n",taxaPercentualDeAumento);
            System.out.printf("Valor do reajuste: %,.2f\n",valorDoAumento);
            System.out.printf("Salário depois do reajuste: %,.2f\n",novoSalario);
            System.out.println("-----------------------------------");

        }

    }

