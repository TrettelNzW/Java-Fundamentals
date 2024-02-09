import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        int soma = 0, numero, resultado;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um Número para a Tabuada: ");
        numero = entrada.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        while (soma <= 10){
            resultado = numero * soma;
            System.out.print(resultado + " ");
           soma++;
        }
    }
}
