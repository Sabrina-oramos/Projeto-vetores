//Solicita 5 valores ao usuário, armazena esses valores em um array chamado vet1 de inteiros.
//Depois, copia o conteúdo desse array para um segundo array chamado vet2. O programa deve
//imprimir os dois arrays na tela.
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] vet1 = new int[5];

        System.out.println("Digite 5 números inteiros: ");

        for (int i = 0; i < 5; i++){
            vet1[i] = leitor.nextInt();
        }

        int[] vet2 = new int[5];

        for (int i = 0; i<5; i++){
            vet2[i] = vet1[i];
        }

        System.out.println("\nOs números inseridos no vet 1 foram: ");
        for (int i = 0; i<5; i++){
            System.out.println(vet1[i]);
        }

        System.out.println("\nOs números do vet 2 são: ");
        for (int i = 0; i<5; i++){
            System.out.println(vet2[i]);
        }

    }
}
