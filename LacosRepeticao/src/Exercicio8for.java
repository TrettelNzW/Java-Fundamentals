import java.util.Scanner;

public class Exercicio8for {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double idade, resultado = 0;

        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Digite a Idade da Pessoa " + (contador + 1) + ": ");
            idade = entrada.nextDouble();
            resultado += idade;
        }

        resultado /= 5;

        System.out.println("A Média de idade é: " + resultado);
    }
}

