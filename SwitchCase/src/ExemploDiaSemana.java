import java.util.Scanner;

public class ExemploDiaSemana {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int dia;  //Declaração da variavel dia

        System.out.println("Digite um dia da semana (em número): ");
        dia = entrada.nextInt();

        switch (dia){ //início do comando switch
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia da semana inválido");

        }//fim do comando switch
    }//fim do método main
}//fim da classe ExemploDiaSemana
