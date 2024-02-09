import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double idade, resultado = 0;
        int contador = 0;

        while (contador < 5) {
            System.out.println("Digite a Idade da Pessoa " + (contador + 1) + ": ");
            idade = entrada.nextDouble();
            resultado += idade;
            contador++;
        }

        resultado /= 5;

        System.out.println("A Média de idade é: " + resultado);
    }
}

