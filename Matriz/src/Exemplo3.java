import java.util.Scanner;

/*
        Declaração do Array - Matriz (Vetor)
        Array Alternativa

        Sintaxe:
        TipoDados NomeVariavel[] = new TipoDados[QuantidadeElemento]
 */
public class Exemplo3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroInteiro[] = new int[5];

    for (int i = 0; i < 5; i++){
        System.out.println("Digite um Número: ");
        numeroInteiro[i] = entrada.nextInt();
    }

        for(int i = 0; i < 5; i++){
            System.out.println(numeroInteiro[i]);
        }
    }
}
