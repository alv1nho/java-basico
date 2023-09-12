import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        // Operador de Atribuição: "=";
        String nome = "Alvaro Andrade";
        int idade = 24;
        double peso = 95.7;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // Operadores Aritmeticos: "+", "-", "*", "/", "%";
        double soma = 10.5 + 15.7;
        int subtracao = 10 - 5;
        int multiplicacao = 5 * 8;
        int divisao = 10 / 2;
        int modulo =  18 % 3;
        double resultado = (10*7) + (20/4);

        // Operador "+" usado em Strings realiza uma concatenação;
        String nomeCompleto = "Alvaro " + "Andrade";
        System.out.println(nomeCompleto);

        String concatenacao;
        concatenacao = 1+1+1+1+"1";
        System.out.println(concatenacao);

        // Operador Unário;
        // Operador unário de valor positivo:
        int numero = 5;

        // Operador unário de valor negativo:
        int numeroNegativo = -5;

        // Operador unário de incremento:
        int numeroIncremento = 1;
        ++numeroIncremento;
        System.out.println(numeroIncremento);

        // Operador unário de incremento:
        int numeroDecremento = 2;
        --numeroDecremento;
        System.out.println(numeroDecremento);

        // Operador de Negação:
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        // Operador Ternário:
        int a = 5;
        int b = 6;

        String valor = a==b ? "Verdadeiro" : "Falso";
        System.out.println(valor);

        // Operadores Relacionais: "== ou ===", "!= ou !==", "> ou >=", "< ou <="
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 != numero2){
            System.out.println("Sim");
        }
        else {
            System.out.println("Não");
        }

        // Operadores Lógicos: "&&" => "E", "||" ou "OU";
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras.");
        } else if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira.");
        }
    }
}
