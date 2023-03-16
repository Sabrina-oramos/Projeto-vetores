import java.util.Scanner;
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] A = {1, 0, 5, -2, -5, 7};
        int soma = A[0] + A[1] + A[5];

        System.out.println("\nA soma dos valores das posições 0, 5 e 6: " + soma);

        A[4] = 100;

        System.out.println("\nValores do vetor A ");
        for (int i = 0; i< A.length; i++){
            System.out.println(A[i]);
        }

    }
}
