import java.util.*;
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];

        // Lendo os elementos do vetor x
        System.out.println("Digite os elementos do vetor x:");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        // Lendo os elementos do vetor y
        System.out.println("Digite os elementos do vetor y:");
        for (int i = 0; i < y.length; i++) {
            y[i] = sc.nextInt();
        }

        // Soma entre x e y
        int[] soma = new int[5];
        for (int i = 0; i < x.length; i++) {
            soma[i] = x[i] + y[i];
        }
        System.out.println("Soma entre x e y: " + Arrays.toString(soma));

        // Produto entre x e y
        int[] produto = new int[5];
        for (int i = 0; i < x.length; i++) {
            produto[i] = x[i] * y[i];
        }
        System.out.println("Produto entre x e y: " + Arrays.toString(produto));

        // Diferença entre x e y
        List<Integer> diferenca = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            if (!Arrays.asList(y).contains(x[i])) {
                diferenca.add(x[i]);
            }
        }
        System.out.println("Diferença entre x e y: " + diferenca);

        // Interseção entre x e y
        List<Integer> intersecao = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            if (Arrays.asList(y).contains(x[i])) {
                intersecao.add(x[i]);
            }
        }
        System.out.println("Interseção entre x e y: " + intersecao);

        // União entre x e y
        List<Integer> uniao = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            if (!uniao.contains(x[i])) {
                uniao.add(x[i]);
            }
        }
        for (int i = 0; i < y.length; i++) {
            if (!uniao.contains(y[i])) {
                uniao.add(y[i]);
            }
        }
        System.out.println("União entre x e y: " + uniao);
    }
}

