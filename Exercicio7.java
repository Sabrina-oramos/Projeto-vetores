// Ler 10 salários. Depois de lidos e armazenados, mostre o maior valor

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double[] salarios = new double[10];

        System.out.println("Digite o salário de 10 funcionários: ");

        for (int i = 0; i<10; i++){
            salarios[i] = leitor.nextDouble();
        }

        double maiorSalario = salarios[0];
        for (int i = 0; i<10; i++){
            if (salarios[i] > maiorSalario){
                maiorSalario = salarios[i];
            }
        }

        System.out.println("\nO maior salário digitado foi: " + maiorSalario);

    }


}
