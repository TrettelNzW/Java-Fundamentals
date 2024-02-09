import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double calculo, num1, num2;

        System.out.println("********** Calculadora **********");
        System.out.println("\n1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("\n*******************************");
        System.out.println("\nDigite o Número da opção desejada");
        calculo = entrada.nextDouble();
        System.out.println("\n*******************************");
        System.out.println("\nDigite o Primeiro Número: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite o Segundo Número: ");
        num2 = entrada.nextDouble();
        System.out.println("\n*******************************");

        if (calculo == 1){
            System.out.println("O resultado do calculo é: " + (num1 + num2));
        } else if (calculo == 2) {
            System.out.println("O resultado do calculo é: " + (num1 - num2));
        } else if (calculo == 3) {
            System.out.println("O resultado do calculo é: " + (num1 * num2));
        } else if (calculo == 4)
            if (num2 == 0) {
                System.out.println("Não é possivel efetuar a divisão");
            } else {
                System.out.println("O resultado do calculo é: " + (num1 / num2));
        }
    }
}
