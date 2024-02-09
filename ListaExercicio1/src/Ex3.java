import java.util.Scanner;

public class Ex3 {

    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        int valor;

                System.out.print("Digite um valor inteiro: ");
                valor = ler.nextInt();

                System.out.println("Número Antecessor: " + (valor - 1));
                System.out.print("Número Sucessor: " + (valor + 1));

    }

}
