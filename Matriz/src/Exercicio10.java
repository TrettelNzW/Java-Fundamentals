import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        System.out.println("Preencha o vetor A:");
        for (int i = 0; i < 8; i++) {
            System.out.print("VetorA[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.println("\nVetorA:");
        for (int i = 0; i < 8; i++) {
            System.out.println("VetorA[" + i + "]: " + vetorA[i]);
        }

        System.out.println("\nVetorB:");
        for (int i = 0; i < 8; i++) {
            System.out.println("VetorB[" + i + "]: " + vetorB[i]);
        }

    }
}

