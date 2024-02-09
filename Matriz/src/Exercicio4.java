import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();


        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetorSoma = new int[tamanho];


        System.out.println("Insira os elementos do vetor 1:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Vetor1[" + i + "]: ");
            vetor1[i] = scanner.nextInt();
        }


        System.out.println("Insira os elementos do vetor 2:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Vetor2[" + i + "]: ");
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        // Exibir o vetor de soma
        System.out.println("Vetor de Soma:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("VetorSoma[" + i + "]: " + vetorSoma[i]);
        }

    }
}
