import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int[] soma = new int[5];
        int[] diferenca = new int[5];
        int[] produto = new int[5];
        double[] divisao = new double[5];

        System.out.println("Digite 5 valores inteiros para o vetor 1:");
        for(int i = 0; i < vet1.length; i++) {
            vet1[i] = leitor.nextInt();
        }

        System.out.println("Digite 5 valores inteiros para o vetor 2:");
        for(int i = 0; i < vet2.length; i++) {
            vet2[i] = leitor.nextInt();
        }

        for(int i = 0; i < soma.length; i++) {
            soma[i] = vet1[i] + vet2[i];
            diferenca[i] = vet1[i] - vet2[i];
            produto[i] = vet1[i] * vet2[i];
            divisao[i] = (double) vet1[i] / vet2[i];
        }

        System.out.println("Soma dos elementos:");
        for(int i = 0; i < soma.length; i++) {
            System.out.print(soma[i] + " ");
        }
        System.out.println();

        System.out.println("Diferença dos elementos:");
        for(int i = 0; i < diferenca.length; i++) {
            System.out.print(diferenca[i] + " ");
        }
        System.out.println();

        System.out.println("Produto dos elementos:");
        for(int i = 0; i < produto.length; i++) {
            System.out.print(produto[i] + " ");
        }
        System.out.println();

        System.out.println("Divisão dos elementos:");
        for(int i = 0; i < divisao.length; i++) {
            System.out.print(divisao[i] + " ");
        }
        System.out.println();

        leitor.close();
    }
}