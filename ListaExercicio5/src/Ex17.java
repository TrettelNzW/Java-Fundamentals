import java.util.Scanner;

public class Ex17 {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        double num1, num2, num3, soma;

        System.out.println("Digite o Primeir Número: ");
        num1 = entrada.nextDouble();

        System.out.println("Digite o Segundo Número: ");
        num2 = entrada.nextDouble();

        System.out.println("Digite o Terceiro Número: ");
        num3 = entrada.nextDouble();

        soma = num1 + num2 + num3;

        if (soma % 5 == 0){
            System.out.println("A soma é divisível por 5.");
        }else{
            System.out.println("A soma não é divisível por 5.");
        }

    }
}
