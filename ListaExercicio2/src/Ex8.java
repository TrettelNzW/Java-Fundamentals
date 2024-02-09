import java.util.Scanner;

public class Ex8 {

    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);

        double raio, area;

        System.out.print("Digite o raio: ");
            raio = ler.nextDouble();

            //possiblidade area = Math.PI = Math.pow(raio, 2.0);
        area = Math.PI * (raio * raio);

            System.out.print("A Área é: " + area);
    }
}
