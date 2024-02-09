import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double valor = 1;

        do {
            System.out.println("Escolha uma das opções: ");
            System.out.println("0 - Termina o Loop");
            System.out.println("1 - Continua o Loop");
            valor = entrada.nextDouble();
        } while (valor == 1);
    }
}
