import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, soma;

        System.out.println("Digite a nota da Prova 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a nota da Prova 2: ");
        nota2 = entrada.nextDouble();

        soma = (nota1 + nota2) / 2;

        if (soma >= 9.0 && soma <= 10.0) {
            System.out.println("Nota: " + soma + " - Conceito (A)");
            System.out.println("APROVADO");
        } else if (soma <= 9.0 && soma >= 7.5) {
            System.out.println("Nota: " + soma + " - Conceito (B)");
            System.out.println("APROVADO");
        } else if (soma <= 7.5 && soma >= 6.0) {
            System.out.println("Nota: " + soma + " - Conceito (C)");
            System.out.println("APROVADO");
        } else if (soma <= 6.0 && soma >= 4.0) {
            System.out.println("Nota: " + soma + " - Conceito (D)");
            System.out.println("REPROVADO");
        } else {
            System.out.println("Nota: " + soma + " - Conceito (E)");
            System.out.println("REPROVADO");
        }
    }
}
