import java.util.Scanner;

public class Exercicio7for {
    public static void main(String[] args) {

        int resultado = 1;
        double base, expoente;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da Base: ");
        base = entrada.nextDouble();
        System.out.println("Digite o valor do Expoente: ");
        expoente = entrada.nextDouble();

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);
    }
}

