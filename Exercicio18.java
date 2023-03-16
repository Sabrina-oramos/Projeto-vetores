import java.util.Scanner;
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos a ser avaliados: ");
        int quantidade = leitor.nextInt();

        String[] alunos = new String[quantidade];
        double[] prova1 = new double[quantidade];
        double[] prova2 = new double[quantidade];
        double[] media = new double[quantidade];

        for (int i = 0; i < quantidade; i++){
            System.out.print("\nDigite o nome do aluno: ");
            alunos[i] = leitor.next();

            System.out.print("Digite a nota da prova 1 do(a) aluno(a) " + alunos[i] + ": ");
            prova1[i] = leitor.nextDouble();

            System.out.print("Digite a nota da prova 2 do(a) aluno(a) " + alunos[i] + ": ");
            prova2[i] = leitor.nextDouble();

            media[i] = (prova1[i] + prova2[i]) / 2;
        }

        System.out.println("Nome:\tProva 1\tProva 2\tMédia: ");
        for (int i = 0; i < quantidade; i++){
            System.out.println(alunos[i] + "\t" + prova1[i] + "\t" + prova2[i] + "\t" + media[i]);
        }
    }
}
