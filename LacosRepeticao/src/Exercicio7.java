import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){

      int resultado = 1;
      int i = 1;
      double base, expoente;

      Scanner entrada = new Scanner(System.in);

      System.out.println("Digite o valor da Base: ");
      base = entrada.nextDouble();
      System.out.println("Digite o valor do Expoente: ");
      expoente = entrada.nextDouble();

      while (i <= expoente){
          resultado *= base;
          i++;
      }
        System.out.println(base + "Elevado a" + expoente + "é igual a: " + resultado);
    }
}
