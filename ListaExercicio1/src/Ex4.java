import java.util.Scanner;

public class Ex4 {

    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);
        double valor;

        System.out.print("Digite um valor Real: ");
        valor = ler.nextDouble();

        System.out.print("1/4 deste número corresponde a: " + (valor / 4.0));
    }
}
