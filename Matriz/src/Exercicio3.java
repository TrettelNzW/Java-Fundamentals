import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();


        int[] vetor = new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }


        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }


        double media = (double) soma / tamanho;


        System.out.printf("Média: %.2f\n", media);


    }
}

