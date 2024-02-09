import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        double num1, num2, soma, subtracao, multiplicacao, divisao;

        System.out.print("Digite o primeiro número: ");
        num1 = ler.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = ler.nextDouble();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = (num1 * num2);
        divisao = num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

    }
}
