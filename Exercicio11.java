import java.util.Scanner;
public class Exercicio11  {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];
        boolean[] numerosPares = new boolean[10]; //Array booleano

        System.out.println("Digite 10 números inteiros: ");
        for (int i =0; i<10; i++){
            numeros[i] = leitor.nextInt();
        }

        for (int i =0; i<10; i++){
            if (numeros[i] % 2 == 0){
                numerosPares[i] = true; //caso seja par
            }else {
                numerosPares[i] = false; //caso seja ímpar
            }
        }

        System.out.println("Valores pares: ");
        for (int i = 0; i<10; i++){
            System.out.print(numerosPares[i] + " ");
        }
    }
}
