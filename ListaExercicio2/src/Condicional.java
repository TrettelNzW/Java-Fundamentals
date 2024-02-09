/*
    Descrição do exercicio *****
    Faça um programa que solicite a idade de uma pessoa e
    exiba se ela é maior de idade ou não.
 */

import java.util.Scanner;

public class Condicional {

    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int valor = entrada.nextInt();

           if (valor >= 18) {
            System.out.print("Maior de Idade");
        }    else
        {
            System.out.print("Menor de Idade");
        }
        }
    }

