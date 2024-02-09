import java.util.Scanner;

public class Ex11 {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        double base, altura, area;

        System.out.print("Digite a Base do Triângulo: ");
        base = entrada.nextDouble();

        System.out.print("Digite a Altura do triangulo: ");
        altura = entrada.nextDouble();

        area = ((base * altura) / 2);

        System.out.print("A Área do Triângulo é: " + area);

    }
}
