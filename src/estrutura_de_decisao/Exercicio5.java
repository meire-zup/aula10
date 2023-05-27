package estrutura_de_decisao;

import java.util.Scanner;
        public class Exercicio5 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Esolha um dia da semana conforme tabela abaixo:");
                System.out.println("------------------");
                System.out.printf("1 - Domingo\n2 - Segunda-feira\n3 - Terça-feira\n4 - Quarta-feira\n5 - Quinta-feira\n6 - Sexta-feira\n7 - Sábado\n");
                System.out.println("------------------");
                System.out.printf("OPÇÂO: ");
                int diaEscolhido = scanner.nextInt();
                switch (diaEscolhido){
                    case 1:
                        System.out.println("O dia escolhido foi Domingo!");
                        break;
                    case 2:
                        System.out.println("O dia escolhido foi Segunda-feira!");
                        break;
                    case 3:
                        System.out.println("O dia escolhido foi Terça-feira!");
                        break;
                    case 4:
                        System.out.println("O dia escolhido foi Quarta-feira!");
                        break;
                    case 5:
                        System.out.println("O dia escolhido foi Quinta-feira!");
                        break;
                    case 6:
                        System.out.println("O dia escolhido foi Sexta-feira!");
                        break;
                    case 7:
                        System.out.println("O dia escolhido foi Sábado!");
                        break;
                    default:
                        System.out.println("Opção inválida!");


                }

            }
        }

