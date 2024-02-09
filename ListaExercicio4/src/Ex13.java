import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double num1, num2, mensagem;

        System.out.print("Digite o Primeiro Número: ");
        num1 = entrada.nextDouble();

        System.out.print("Digite o Segundo Número: ");
        num2 = entrada.nextDouble();


        if (num1 > num2) {
            System.out.print(num1 + "O Primeiro Número é Maior");
        } else if (num2 > num1){

            System.out.print(num2 + "O Segundo Número é Maior");
        }else {
            System.out.print("Os Números são Iguais");

        }
    }
}


