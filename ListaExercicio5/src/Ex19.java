import java.util.Scanner;

    public class Ex19 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.print("Digite o primeiro número: ");
        int num1 = ler.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = ler.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = ler.nextInt();

        if(num1 >= num2 && num1 >= num3){
            if(num2 > num3) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else if(num2 >= num1 && num2 >= num3) {
            if(num1 > num3) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else {
            if(num1 > num2) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num1 + " " + num2 + " " + num3);
            }
        }
    }
}
