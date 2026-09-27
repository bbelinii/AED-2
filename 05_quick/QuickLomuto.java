public class QuickLomuto {
    public static void ordenar(int[] v) {
        quickSort(v, 0, v.length - 1);
    }

    private static void quickSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int p = particionar(v, inicio, fim);

            // Mesmo vetor, intervalo da esquerda.
            quickSort(v, inicio, p - 1);

            // Mesmo vetor, intervalo da direita.
            quickSort(v, p + 1, fim);
        }
    }

    private static int particionar(int[] v, int inicio, int fim) {
        int pivo = v[fim];

        // i = última posição da região dos menores/iguais ao pivô.
        int i = inicio - 1;

        // j visita cada elemento antes do pivô.
        for (int j = inicio; j < fim; j++) {
            if (v[j] <= pivo) {
                i++;
                trocar(v, i, j);
            }
        }

        // O pivô entra logo depois da região dos menores.
        trocar(v, i + 1, fim);

        // Retorna a posição definitiva do pivô.
        return i + 1;
    }

    private static void trocar(int[] v, int a, int b) {
        int temp = v[a];
        v[a] = v[b];
        v[b] = temp;
    }
}
