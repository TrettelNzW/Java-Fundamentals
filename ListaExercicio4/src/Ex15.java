import java.util.Scanner;

public class Ex15 {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        double num1;

        System.out.print("Digite um Número: ");
        num1 = entrada.nextDouble();

            if (num1 > 0) {
                System.out.print("O Número é Positivo");
            }else if (num1 == 0) {
                System.out.print("O Número é Zero");
            }else if (num1 < 0) {
                System.out.print("O Número é Negativo");

            }
    }
}
