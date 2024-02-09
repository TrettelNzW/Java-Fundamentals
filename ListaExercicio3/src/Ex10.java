import java.util.Scanner;

public class Ex10 {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        double largura, comprimento, perimetro, area;

        System.out.print("Digite a largura: ");
        largura = entrada.nextDouble();

        System.out.print("Digite o comprimento: ");
        comprimento = entrada.nextDouble();

        perimetro = (largura * 2 + comprimento * 2);
        area = (largura * comprimento);

        System.out.print("Perímetro: " + perimetro + "\nÁrea: " + area);

    }
}
