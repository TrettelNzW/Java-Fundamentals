public class Exercicio6 {
    public static void main(String[] args){

        int soma = 0;
        for (int numero = 0; numero <= 100; numero++){
            if (numero % 2 == 0){

                soma += numero;
                System.out.print(numero + " ");
            }
        }
        System.out.println("\nA Soma dos Números pares de 1 a 100 é: " + soma);
    }
}
