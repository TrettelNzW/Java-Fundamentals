    /*
    Descrição
    Crie um programa que imprima a média aritimética de duas notas, Utilize o tipo de variável real.

    Lista de Exercício 1 - Ex1
    Data: 12/01/2024
    Programador: Arthur Trettel
     */

    import java.util.Scanner;

    public class Ex1 {
    public static void main(String[]args){
        //INSTANCIANDO E CRIANDO UM OBJETO SCANNER
        Scanner ler = new Scanner(System.in);

        //DECLARAÇÃO DE VARIÁVEL
        double pim, np1, np2, totalpim, totalnp1, totalnp2, total, media;

        //ENTRADA DE DADOS
        System.out.print("Digite a nota da NP1: ");
        np1 = ler.nextDouble();

        System.out.print("Digite a nota da NP2: ");
        np2 = ler.nextDouble();

        System.out.print("Digite a nota do PIM: ");
        pim = ler.nextDouble();

        //PROCESSAMENTO
        totalpim = pim * 2.0;
        totalnp1 = np1 * 4.0;
        totalnp2 = np2 * 4.0;
        total = totalpim + totalnp1 + totalnp2;
        media = total / 10.0;

            if(media >= 6.75){
                System.out.print("Você foi Aprovado, Nota Final = " + media);
            }
            else{
                if(media <= 6.75){
                    System.out.println("Você ficou de Exame, e sua nota final é = " + media);

                    double exame, np3, mediafinal;

                    exame = media / 2.0;

                    System.out.println("Você precia tirar no mínimo = " + (10 - media) + " no exame para ser Aprovado");

                    System.out.print("Digite a nota da NP3 (Exame): " );
                    np3 = ler.nextDouble();

                    mediafinal = exame + (np3 / 2.0);

                    if(mediafinal >= 4.75) {
                        System.out.print("Você foi Aprovado, Nota Final = " + mediafinal);
                    }
                    else{
                        if(mediafinal <= 4.75)
                            System.out.print("Você foi Reprovado, Nota Final = " + mediafinal);
                    }
                }
            }


    }
}
