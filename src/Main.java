import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aresta = 0;
        // Criando o grafo

        System.out.println("Quantos vértices deseja? ");
        int n = in.nextInt();
        int[][] grafo = new int[n + 1][n + 1];

        // Lendo as arestas do grafo
        for (int i = 1; i < grafo.length; i++) {
            for (int j = 1; j < grafo.length; j++) {
                int entrada;
                do {
                    System.out.print("Existe uma aresta entre " + i + " e " + j + "? (1 para sim, 0 para não): ");
                    entrada = in.nextInt();
                    if (entrada != 0 && entrada != 1) {
                        System.out.println("Erro! A entrada deve ser 0 para não ou 1.");
                    }
                } while (entrada != 0 && entrada != 1);
                grafo[i][j] = entrada;

                if (grafo[i][j] != 0) {
                    aresta = aresta + 1;
                }
            }
        }

        System.out.println("Número de vértices: " + n);
        System.out.println("Número de arestas: " + aresta);

        // Imprimindo a matriz de adjacência do grafo
        System.out.println("Matriz de adjacência do grafo:");
        for (int i = 1; i < grafo.length; i++) {
            for (int j = 1; j < grafo.length; j++) {
                System.out.print(grafo[i][j] + " ");
            }
            System.out.println();
        }
    }
}