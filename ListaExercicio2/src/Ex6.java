import java.util.Scanner;

public class Ex6 {

    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);

        double num1, num2, num3, media;

        System.out.print("Digite o primeiro número: ");
            num1 = ler.nextDouble();

        System.out.print("Digite o segundo número: ");
            num2 = ler.nextDouble();

        System.out.print("Digite o terceiro número: ");
            num3 = ler.nextDouble();

            media = Math.pow(num1 * num2 * num3, 1.0/3.0);

        System.out.print("Média Geométrica: " + media);
    }
}
