import java.util.Scanner;

/*
    Exemplo de um loop infinito ultilizando o laço de repetição while
 */
public class Exemplo1 {
    public static void main(String[] args){

       Scanner entrada = new Scanner(System.in);
       double valor = 1;

       while (valor == 1){
           System.out.println("Escola uma das opções");
           System.out.println("0 - termina o Loop");
           System.out.println("1 - continua o Loop");
           valor = entrada.nextDouble();
            }// fim do while
        }// fim do método main
    }//fim do código

