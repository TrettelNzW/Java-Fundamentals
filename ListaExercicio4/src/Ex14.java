import java.util.Scanner;

public class Ex14 {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        double num1;

        System.out.print("Digite um Número: ");
        num1 = entrada.nextDouble();

        if ((num1 % 2) == 1) {
            System.out.print("O Numero informado é Impar");
        }else {
            System.out.print("O Número informado é Par");

        }
    }
}
