import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];
        int negativos = 0;

        System.out.println("Digite 10 números aleatórios: ");

        for (int i = 0; i<10; i++){
            numeros[i] = leitor.nextInt();
        }

        for (int i = 0; i<10; i++){
            if (numeros[i] < 0){
                negativos++; //percorre a array números e armazena na variável negativos
            }
        }

        System.out.println("A quantidade de números negativos é: " + negativos);
    }
}