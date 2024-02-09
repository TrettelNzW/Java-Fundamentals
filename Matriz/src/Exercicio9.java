import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        boolean todosPares = true;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 != 0) {
                todosPares = false;
                break;
            }
        }

        if (todosPares) {
            System.out.println("Resposta: Todos os elementos são pares.");
        } else {
            System.out.println("Resposta: Existem elementos ímpares no vetor.");
        }

    }
}
