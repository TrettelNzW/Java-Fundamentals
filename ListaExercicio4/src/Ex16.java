import java.util.Scanner;

public class Ex16 {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        double prova1, prova2, media;

        System.out.print("Digite a Nota da Prova 1: ");
        prova1 = entrada.nextDouble();
        System.out.print("Digite a Nota da Prova 2: ");
        prova2 = entrada.nextDouble();

        media = (prova1 + prova2) / 2;

        if (media >= 6) {
            System.out.print("Média: " + media + "\nAprovado");
        }else if (media < 6 && media >= 5){
                System.out.print("Média: " + media + "\nRecuperação");
            }else if(media < 5) {
            System.out.print("Média: " + media + "\nReprovado");
        }
        }
        }


