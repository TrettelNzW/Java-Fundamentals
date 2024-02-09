import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double celsius, kelvin, reaumur, rankine, fahrenheit;

        System.out.println("Digite a temperatura em Graus Celsius: ");
        celsius = entrada.nextDouble();

        System.out.println("Fahrenheit (F): " + (celsius * 9 / 5) + 32);
        System.out.println("Kelvin (K): " + (celsius + 273.15));
        System.out.println("Réaumur (Re): " + (celsius * 4) / 5);
        System.out.println("Rankine (Ra): " + ((celsius + 273.15) * 9 / 5));
    }
}
