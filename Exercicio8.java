//Crie um programa que leia 6 valores inteiros pares e, em seguida, mostre na tela os valores lidos
//na ordem inversa

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[6];

        System.out.println("Digite 6 valores inteiros pares: ");

        for (int i = 0; i<6; i++) {
            do {
                numeros[i] = leitor.nextInt();
            } while (numeros[i] % 2 != 0);
        }
            System.out.print("\nValores na ordem inversa: ");

            for (int i = 5; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }
        }
    }

