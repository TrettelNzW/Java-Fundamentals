import java.util.Scanner;

public class ExemploCalculadora1 {

    public static void main(String[]agrs){

    Scanner ler = new Scanner(System.in);
    double resultado = 0.0;

    System.out.println("************************************");
    System.out.println("*             Calculadora          *");
    System.out.println("************************************");
    System.out.println("\n1 - Adição");
    System.out.println("\n2 - Subtração");
    System.out.println("\n3 - Multiplicação");
    System.out.println("\n4 - Divisão");
    System.out.println("\n******************************");
    System.out.println("\nDigite a opção desejada: ");
    int opcao = ler.nextInt();
    System.out.println("\n*****************************");
    System.out.println("\nDigite o primeiro número: ");
    double num1 = ler.nextDouble();
    System.out.println("\nDigite o segundo número: ");
    double num2 = ler.nextDouble();
    System.out.println("\n****************************");

        //DESVIO CONDICIONAL - IF/ELSE
        if (opcao == 1) { // Se igual á 1 - Adição
            resultado = num1 + num2;
            System.out.println("O resultado da Adição é: " + resultado);
        } else if (opcao == 2) { // Se igual á 2 - Subtração
            resultado = num1 - num2;
            System.out.println("O resultado da Subtração é: " + resultado);
        } else if (opcao == 3) { // Se igual á 3 - Multiplicação
            resultado = num1 * num2;
            System.out.println("O resultado da Multiplicação é: " + resultado);
        } else if (opcao == 4) { // Se igual á 4 - Divisão
            if(num2 == 0){
                System.out.println("Não é possivel efetuar a divisão.");
            } else {
                resultado = num1 / num2;
                System.out.println("O resultado da Divisão é: " + resultado);
            }
        } else { // Se não for nenhuma das opções, apresentar a msg abaixo
            System.out.println("Opção Inválida");
        }
    }
}
