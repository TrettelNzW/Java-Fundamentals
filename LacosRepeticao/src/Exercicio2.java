public class Exercicio2 {
    public static void main(String[] args){

        System.out.println("Números pares de 1 a 50: ");
        for (int numero = 1; numero <= 50; numero++){
            if(numero % 2 == 0){
                System.out.print(numero + " ");
            }
        }
        System.out.println("\nNúmeros impares de 51 a 100");
        for (int numero = 51; numero <= 100; numero++){
            if(numero % 2 == 1){
                System.out.print(numero + " ");
            }
        }
    }
}
