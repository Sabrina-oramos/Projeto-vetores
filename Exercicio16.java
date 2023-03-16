import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores a serem lidos: ");
        int n = leitor.nextInt();

        double[] numeros = new double[n];
        double soma = 0;

        System.out.println("Digite " + n + " números aleatórios");
        for (int i = 0; i<n; i++){
            numeros[i] = leitor.nextDouble();
            soma += numeros[i];
        }

        double media = soma/n;

        System.out.println("\nA média aritmética dos " + n + " valores é " + media);
    }
}
