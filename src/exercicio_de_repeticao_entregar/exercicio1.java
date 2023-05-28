package exercicio_de_repeticao_entregar;

public class exercicio1 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("MOSTRANDO NÚMEROS DE 1 a 100 UTILIZANDO FOR:");
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("MOSTRANDO NÚMEROS DE 1 a 100 UTILIZANDO WHILE:");
        int contador = 1;
        while (contador<=100){
            System.out.println(contador);
            contador++;
        }
    }
}
