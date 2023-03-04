//Preenche um array de tamanho 10 com números lidos pelo teclado e mostre os valores lidos

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números aleatórios: ");

        for (int i = 0; i<10; i++){
            numeros[i] = leitor.nextInt();
        }

        System.out.println("os números inseridos foram: ");

        for (int i = 0; i<10; i++){
            System.out.println(numeros[i]);
        }
        leitor.close();
    }
}
