//Modifique o exercício 3 de forma que o conteúdo de vet1 seja copiado para vet2 de forma
//invertida

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] vet1 = new int[8];

        System.out.println("Insira 5 números inteiros: ");
        for (int i = 0; i<8; i++){
            vet1[i] = leitor.nextInt();
        }

        int[] vet2 = new int[8];

        for (int i = 0; i<8; i++){
        vet2[i] = vet1[7 - i];
        }

        System.out.println("\nNúmeros inseridos no vet1: ");
        for (int i = 0; i<8; i++){
            System.out.println(vet1[i] + " ");
        }

        System.out.println("\nvet 2 invertido: ");
        for (int i = 0; i<8; i++){
            System.out.println(vet2[i] + " ");
        }



    }

}
