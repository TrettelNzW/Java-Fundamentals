import java.util.Scanner;

public class Exemplo5 {
        public static void main(String[] args) {
            int numero;

            Scanner entrada = new Scanner(System.in);


            System.out.println("coloque um numero");
            numero = entrada.nextInt();


            while (numero <= 2500) {
                System.out.println("Número Inteiro " + numero);
                numero++;
            }
        }
}
