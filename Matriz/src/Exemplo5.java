import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numero = new int[5];
        int i = 0;

        //entrada de dados
        while (i < 5) {
            System.out.println("Digite um Número: ");
            numero[i] = ler.nextInt();
            i++;
        }

        //saída de dados
        System.out.println("Exibindo os Números cadastrados");
        for (i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }
}