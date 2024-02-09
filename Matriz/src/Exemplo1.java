/*
        Declaração do Array - Matriz (Vetor)
        Array Introduzida

        Sintaxe:
        TipoDados[] NomeVariavel;
        NomeVariavel = new TipoDados[QuantidadeElemento]
 */
public class Exemplo1 {
    public static void main(String[] args) {

        String[] escritorio;
        escritorio = new String[6];

        //Atribuição de valores
        //NomeVariavel[Indice] = valor;
        escritorio[0] = "lápis";
        escritorio[1] = "Caneta";
        escritorio[2] = "Monitor";
        escritorio[3] = "Mesa";
        escritorio[4] = "Teclado";
        escritorio[5] = "Mouse";

        //Exibir o conteúdo do vetor
        System.out.println(escritorio[0]);
        System.out.println(escritorio[1]);
        System.out.println(escritorio[2]);
        System.out.println(escritorio[3]);
        System.out.println(escritorio[4]);
        System.out.println(escritorio[5]);
    }
}
