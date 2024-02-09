import java.util.Scanner;

public class ExemploCondicional {

    public static void main(String[]args){

        //instanciando um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número 1 para ver a mensagem: ");
        int valor = entrada.nextInt();

        //Teste condicional
        if(valor == 1) {
            System.out.print("Hello World");
        }
        else {
            System.out.print("Quit World");
        }
    }
}
