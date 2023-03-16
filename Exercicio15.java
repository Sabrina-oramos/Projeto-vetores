import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double[] salarios = new double[5];

        System.out.println("Digite o salário de 5 funcionários para verificarmos se necessitam de aumento: ");
        for (int i = 0; i<5; i++) {
            salarios[i] = leitor.nextDouble();
            if (salarios[i] < 1000) {
                salarios[i] *= 1.1;
            }
        }

        System.out.println("\nSalários atualizados: ");
        for (int i = 0; i < 5; i++){
            System.out.println("A " + (i+1) + " pessoa, receberá: R$" + salarios[i]);
        }

    }
}
