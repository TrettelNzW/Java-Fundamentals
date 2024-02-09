public class Exercicio5 {

    public static void main(String[] args) {

        int numero = 0;
        int soma = 0;

        while (numero <= 100) {
            if (numero % 2 == 0) {

                soma += numero; //soma = soma + numero
                System.out.print(numero + " ");
            }numero++;
        }
        System.out.println("\nA Soma dos números pares de 1 a 100 é: " + soma);
    }
}