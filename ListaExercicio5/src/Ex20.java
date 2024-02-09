import java.util.Scanner;

public class Ex20 {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        double prova1, prova2, prova3, media;

        System.out.println("Digite a nota da Prova 1: ");
        prova1 = entrada.nextDouble();

        System.out.println("Digite a nota da Prova 2: ");
        prova2 = entrada.nextDouble();

        System.out.println("Digite a nota da Prova 3: ");
        prova3 = entrada.nextDouble();

        media = (prova1 + prova2 + prova3) / 3;

        if(media >= 7){
            System.out.println("Você foi Aprovado");
        }else if(media <= 4){
            System.out.println("Você foi Reprovado");
        }else{
            System.out.println("Você está de Recuperação");
        }
    }
}
