import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double base, baseMaior,  altura, lado, diagonalMaior, diagonalMenor, raio;
        int figura;

        System.out.println("**********************************");
        System.out.println("*** ÁREA - FIGURAS GEOMÉTRICAS ***");
        System.out.println("**********************************");

        System.out.println("\n1 - Triângulo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Losango");
        System.out.println("4 - Retângulo");
        System.out.println("5 - Trapézio");
        System.out.println("6 - Círculo");

        System.out.println("\n*******************************");

        System.out.println("\nDigite a opção de uma figura: ");
        figura = entrada.nextInt();

        System.out.println("\n*******************************");

        switch (figura) {
            case 1:
                System.out.println("\nDigite o valor da Base: ");
                base = entrada.nextDouble();
                System.out.println("Digite o valor da Altura: ");
                altura = entrada.nextDouble();
                System.out.println("A Área do Triângulo é: " + (base * altura) / 2);
                break;

            case 2:
                System.out.println("\nDigite o valor do Lado: ");
                lado = entrada.nextDouble();
                System.out.println("A Área do Quadrado é: " + (lado * lado));
                break;

            case 3:
                System.out.println("\nDigite o valor da Diagonal Maior: ");
                diagonalMaior = entrada.nextDouble();
                System.out.println("Digite o valor da Diagonal Menor: ");
                diagonalMenor = entrada.nextDouble();
                System.out.println("A Área do Losango é: " + (diagonalMaior * diagonalMenor) / 2);
                break;

            case 4:
                System.out.println("\nDigite o valor da Base: ");
                base = entrada.nextDouble();
                System.out.println("Digite o valor da Altura: ");
                altura = entrada.nextDouble();
                System.out.println("A Área do Retângulo é: " + (base * altura));
                break;

            case 5:
                System.out.println("\nDigite o valor da Base Menor: ");
                base = entrada.nextDouble();
                System.out.println("Digite o valor da Base Maior: ");
                baseMaior = entrada.nextDouble();
                System.out.println("Digite o valor da Altura: ");
                altura = entrada.nextDouble();
                System.out.println("A Área do Trapézio é: " + ((base + baseMaior) * altura) / 2);
                break;

            case 6:
                System.out.println("Digite o valor do Raio: ");
                raio = entrada.nextDouble();
                System.out.println("A Área do Círculo é: " + Math.PI * Math.pow(raio, 2));
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida de 1 a 6.");
        }
    }
}
