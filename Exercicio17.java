import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int contador = 0;

        int[] vetor = new int[10];

        while (contador<10) {
            System.out.println("\nDigite um número: ");
            int numero = leitor.nextInt();

            boolean existe = false;

            for (int i = 0; i < contador; i++) {
                if (vetor[i] == numero) {
                    existe = true;
                    System.out.println("\nNúmero já inserido. Digite outro número: ");
                    break;
                }
            }
            if (!existe) {
                vetor[contador] = numero;
                contador++;
            }
        }

        System.out.println("\nVetor final: ");
        for (int i = 0; i<10; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}