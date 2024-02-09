import java.util.Scanner;

public class Exercico10for {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int total = 0;

        for (int contador = 0; contador < 10; contador++) {
            System.out.println("Digite o " + (contador + 1) + "º Número: ");
            numero = entrada.nextInt();
            if (numero >= 0 && numero <= 100) {
                total++;
            }
        }
        System.out.println("O Total ne Números inteiros que estão entre 0 a 100 são: " + total);
    }
}