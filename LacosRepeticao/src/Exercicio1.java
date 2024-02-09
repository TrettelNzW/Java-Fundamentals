public class Exercicio1 {

    public static void main(String[] args){
        int numero = 1;

        System.out.println("Números pares de 1 a 50:");
        while (numero <= 50) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
            numero++;
        }

        numero = 51;

        System.out.println("\nNúmeros ímpares de 51 a 100:");
        while (numero <= 100) {
            if (numero % 2 == 1) {
                System.out.print(numero + " ");
            }
            numero++;
        }
    }
}



