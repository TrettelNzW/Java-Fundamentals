import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] vetor = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }


        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += vetor[i];
        }


        System.out.println("Resultado: " + soma);


    }
}

