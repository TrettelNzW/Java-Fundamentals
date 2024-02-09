import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double idade;

        System.out.println("Digite a sa Idade: ");
        idade = entrada.nextDouble();

        if (idade <= 15) {
            System.out.println("Você não pode votar (aguarde completar 18 anos)");
        } else if (idade >= 18 && idade <= 69) {
            System.out.println(("Você é obrigado a votar (Caso não compareça no dia das eleições, resultara em multa e será impedido de sair do país legalmente"));
        } else {
            System.out.println("Você não é Obrigado a votar");
        }
    }
}