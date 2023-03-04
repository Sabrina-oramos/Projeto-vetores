import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        double[] valores = new double[20];

    System.out.println("Digite 20 números reais: ");

        for (int i = 0; i<20; i++){
            valores[i] = leitor.nextDouble();
            soma += valores[i];
        }

        double media = soma / valores.length;


        System.out.println("\nA média aritmética é: " + media);

        System.out.println("\nValores menores que a média: ");

        for (int i = 0; i < valores.length; i++){
            if (valores[i] < media){
                System.out.println(valores[i]);
            }
        }
    }
}
