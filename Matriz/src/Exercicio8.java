import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite o número a ser buscado: ");
        int numeroBuscado = scanner.nextInt();

        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numeroBuscado) {
                contador++;
            }
        }

        System.out.println("Resultado: " + contador);

    }
}
