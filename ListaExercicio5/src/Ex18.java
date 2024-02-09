import java.util.Scanner;

public class Ex18 {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        double num1, num2, num3, soma;

        System.out.println("Digite o Primeiro Número:");
        num1 = entrada.nextDouble();

        System.out.println("Digite o Segundo Número:");
        num2 = entrada.nextDouble();

        System.out.println("Digite o Terceiro Número:");
        num3 = entrada.nextDouble();

        soma = num1 + num2 + num3;

        if (soma > 0){
            System.out.println("A Soma é Positivo");
        }else if (soma < 0){
            System.out.println("A Soma é Negativa");
        }else{
            System.out.println("A Soma é igual a Zero");
        }
    }
}
