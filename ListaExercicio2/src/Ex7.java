import java.util.Scanner;

public class Ex7 {

    public static void main(String[]args) {

        Scanner ler = new Scanner(System.in);

        double raio, perimetro;

        System.out.print("Digite o Raio: ");
                raio = ler.nextDouble();

        perimetro = 2 * Math.PI * raio;

        System.out.print("Perímetro: " + perimetro);


    }
}
