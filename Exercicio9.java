import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros: ");

        for (int i = 0; i < 10; i++){
            numeros[i] = leitor.nextInt();
        }

        System.out.println("Informe um número que deseja procurar no vetor: ");
        int pesquisaNum = leitor.nextInt();

        int posicao = -1;
        for (int i = 0; i< numeros.length; i++){
            if (numeros[i] == pesquisaNum){
                posicao = i;
                break;
            }
        }

        if (posicao == -1){
            System.out.println("O número " + pesquisaNum + "não foi encontrado no vetor!");
        }else {
            System.out.println("O número " + pesquisaNum + " foi encontrado na posição " + posicao + " do vetor.");
        }

    }
}
