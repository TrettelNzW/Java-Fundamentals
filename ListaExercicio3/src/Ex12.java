import java.util.Scanner;

public class Ex12 {

    public static void main(String[]args) {

        Scanner entrada = new Scanner(System.in);

        double raio, volume;

        System.out.print("Digite o Raio da Esfera: ");
        raio = entrada.nextDouble();

        volume = (raio * raio * raio) * (Math.PI * 4) /3;

        System.out.print("Volume: " + volume);

    }
}
