import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double[] numerosReais = new  double[10];

        System.out.println("Digite 10 números reais para que possamos calcular o quadro desses números: ");
        for (int i = 0; i< numerosReais.length; i++){
            numerosReais[i] = leitor.nextDouble();
        }

        double[] numerosQuadrados = new double[10];

        for (int i = 0; i < numerosReais.length; i++){
            numerosQuadrados[i] = Math.pow(numerosReais[i], 2);
        }

        System.out.println("\nConjunto de numeros reais: ");
        for (int i = 0; i< numerosReais.length; i++){
            System.out.print(numerosReais[i] + " ");
        }

        System.out.println("\nConjunto de números quadrados calculados: ");
        for (int i = 0; i < numerosQuadrados.length; i++){
            System.out.print(numerosQuadrados[i] + " ");
        }
    }
}
