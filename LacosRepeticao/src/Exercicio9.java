import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double numero, total = 0;
        int contador = 0;

        while (contador < 20){
            System.out.print("Digite o " + (contador + 1) + "º Número: ");
            numero = entrada.nextDouble();
            if(numero > 10){
                total++;
            }
            contador++;
        }
        System.out.println("O Total dos Números maiores que 10 são: " + total);
    }
}
