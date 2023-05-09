import java.util.*;

public class Grafo {

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
				System.out.print("Existe uma aresta entre " + i + " e " + j + "? (1 para sim, 0 para não): ");
				grafo[i][j] = in.nextInt();

				if (grafo.length != 1 || grafo.length != 0) {
					System.out.println("Erro! apenas números 1 para sim e 0 para não.");
				} else if(j != 1 || j != 0) {
					System.out.println("Erro! apenas números 1 para sim e 0 para não.");	
					
					break;
				}
				if (grafo[i][j] != 0) {
					aresta = aresta + 1;
				}
			    in.close();
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
