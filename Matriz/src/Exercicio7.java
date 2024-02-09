import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("Resultado: " + maior);

    }
}

