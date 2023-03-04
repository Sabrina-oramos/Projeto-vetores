//Preenche um array de tamanho 10 com números lidos pelo teclado

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números aleatórios: ");

        for(int i = 0; i<10; i++) {
            numeros[i] = leitor.nextInt();
        }
        leitor.close();
    }
}
