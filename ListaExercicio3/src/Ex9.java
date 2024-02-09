import java.util.Scanner;

public class Ex9 {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int a, b, c, delta;

        System.out.print("a:");
        a = entrada.nextInt();

        System.out.print("b:");
        b = entrada.nextInt();

        System.out.print("c:");
        c = entrada.nextInt();

        delta = (b * b - (4 * a * c));

        System.out.print("Delta é igua a:" + delta);
    }
}
