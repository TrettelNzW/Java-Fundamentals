import java.util.Scanner;

public class Exercicio4 {
    public static void main(String [] args){

        int numero, resultado;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um Número para saber sua Tabuada: ");
        numero = entrada.nextInt();

        System.out.println("Tabuado do" + numero + ":");
        for (int soma = 0; soma <=10; soma++){
            resultado = numero * soma;
            System.out.print(resultado + " ");
        }
    }
}
