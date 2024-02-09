import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int numero = 0;
        int total = 0;

        while (contador < 10) {
            System.out.println("Digite o " + (contador + 1) + "º Número: ");
            numero = entrada.nextInt();
            if (numero >= 0 && numero <= 100) {
                total++;
            }
            contador++;
        }
        System.out.println("O Total ne Números inteiros que estão entre 0 a 100 são: " + total);
    }
}
