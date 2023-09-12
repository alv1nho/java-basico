public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos primitivos;
        double salarioMinimo = 2.500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Váriaveis e Constantes;
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        // Constante: definindo "final" e o nome da váriavel em caixa alta;
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);

        // Strings;
        String nome = "Alvaro Andrade";
        System.out.println(nome);
    }
}