/*
        Declaração do Array - Matriz (Vetor)
        Array Introduzida

        Sintaxe:
        TipoDados[] NomeVariavel = new TipoDados[QuantidadeElemento]
 */
public class Exemplo2 {
    public static void main(String[] args) {
        int[] numeroInteiro = new int[4];

        //Atribuição de valores
        numeroInteiro[0] = 34;
        numeroInteiro[1] = 37;
        numeroInteiro[2] = 20;
        numeroInteiro[3] = 10;

        for(int i = 0; i < 4; i++){
            System.out.println(numeroInteiro[i]);
        }
    }
}
