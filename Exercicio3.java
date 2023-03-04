//Solicita 8 inteiros ao usuário e guarda esses valores em um array. Depois o programa deve
//descobrir e exibir qual a posição do elemento de maior valor.

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[8];

        System.out.println("Digite 8 números inteiros: ");

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = leitor.nextInt();
        }

        int maiorValor = numeros[0];
        int posicao= 0;
        for (int i = 1; i < numeros.length; i++){
            if(numeros[i] > maiorValor){
                maiorValor = numeros[i];
                posicao = i;
            }
        }

        System.out.println("O maior valor é " + maiorValor + ", está na posição " + posicao);
    }
}
