import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];
        int numerosPares = 0;

        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leitor.nextInt();
            if (numeros[i] %2 == 0){ //se o resto da divisão for 0 ele é acrescentado nos numeros pares.
                numerosPares++;
            }
        }

        System.out.println("O vetor possui " + numerosPares + " númeors pares.");

    }
}