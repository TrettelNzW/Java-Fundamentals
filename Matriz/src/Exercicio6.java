import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 números diferentes de zero para preencher o vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento[" + i + "]: ");
            int numero = scanner.nextInt();

            while (numero == 0) {
                System.out.println("O número zero não é permitido. Por favor, digite outro número.");
                System.out.print("Elemento[" + i + "]: ");
                numero = scanner.nextInt();
            }

            vetor[i] = numero;
        }

        boolean encontrouIgual = false;
        System.out.println("Valores iguais:");
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (vetor[i] == vetor[j]) {
                    encontrouIgual = true;
                    System.out.println("Índice " + i + " e índice " + j + ": " + vetor[i]);
                }
            }
        }

        if (!encontrouIgual) {
            System.out.println("Não foram encontrados valores iguais.");
        }

        scanner.close();
    }
}

