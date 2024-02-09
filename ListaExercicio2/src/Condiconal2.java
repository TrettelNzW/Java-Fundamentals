/*
Se valor digitado pelo usúario for maior ou igual 500, apresentando
mensagem "Valor Alto".

Se o valor digitado pelo usúario for menor que 500 e maior ou igual a 100,
 apresentar a mensagem "Valor Médio".

 Se o valor digitado for menor que 100, apresentar
 a mensagem "Valor Baixo".
 */

import java.util.Scanner;

public class Condiconal2 {

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = entrada.nextInt();


            if(valor >= 500){
            System.out.print("Valor Alto");
        }

            else if (valor < 500 && valor >= 100){
            System.out.print("Valor Médio");
        }

            else if (valor < 100) {
            System.out.print("Valor Baixo");
        }
        }
    }