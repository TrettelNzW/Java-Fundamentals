import java.util.Scanner;

public class Exercicio9for {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double numero;
        int total = 0;

        for (int contador = 0; contador < 20; contador++) {
            System.out.print("Digite o " + (contador + 1) + "º Número: ");
            numero = entrada.nextDouble();
            if (numero > 10) {
                total++;
            }
        }

        System.out.println("O Total dos Números maiores que 10 são: " + total);
    }
}

