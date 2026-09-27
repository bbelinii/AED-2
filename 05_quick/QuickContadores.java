public class QuickContadores {
    private static long comparacoes;
    private static long trocas;

    public static void ordenar(int[] v) {
        comparacoes = 0;
        trocas = 0;
        quickSort(v, 0, v.length - 1);
        System.out.println("Comparacoes: " + comparacoes);
        System.out.println("Trocas: " + trocas);
    }

    private static void quickSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int p = particionar(v, inicio, fim);
            quickSort(v, inicio, p - 1);
            quickSort(v, p + 1, fim);
        }
    }

    private static int particionar(int[] v, int inicio, int fim) {
        int pivo = v[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            comparacoes++;
            if (v[j] <= pivo) {
                i++;
                trocar(v, i, j);
            }
        }

        trocar(v, i + 1, fim);
        return i + 1;
    }

    private static void trocar(int[] v, int a, int b) {
        if (a != b) trocas++;
        int t = v[a]; v[a] = v[b]; v[b] = t;
    }
}
----------------------------------------
public class QuickSort {

    public static void quickSort(int[] vetor, int inicio, int fim) {

        // Só entra se existir pelo menos 2 elementos no intervalo
        if (inicio < fim) {

            // Coloca o pivô na posição correta
            int posicaoPivo = particionar(vetor, inicio, fim);

            // Ordena a parte da esquerda
            quickSort(vetor, inicio, posicaoPivo - 1);

            // Ordena a parte da direita
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    public static int particionar(int[] vetor, int inicio, int fim) {

        // Último elemento é o pivô
        int pivo = vetor[fim];

        // i marca o final da região dos menores
        int i = inicio - 1;

        // j percorre o vetor procurando valores menores que o pivô
        for (int j = inicio; j < fim; j++) {

            if (vetor[j] <= pivo) {

                i++;

                // troca vetor[i] com vetor[j]
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        // Coloca o pivô logo depois da região dos menores
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        // Retorna a posição final do pivô
        return i + 1;
    }

    public static void main(String[] args) {

        int[] vetor = {8, 3, 7, 2, 6};

        quickSort(vetor, 0, vetor.length - 1);

        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
    }
}    
