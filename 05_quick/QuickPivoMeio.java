public class QuickPivoMeio {
    public static void ordenar(int[] v) {
        quickSort(v, 0, v.length - 1);
    }

    private static void quickSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int p = particionar(v, inicio, fim);
            quickSort(v, inicio, p - 1);
            quickSort(v, p + 1, fim);
        }
    }

    private static int particionar(int[] v, int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        int pivo = v[meio];

        // Move o pivô escolhido para o fim e usa Lomuto.
        trocar(v, meio, fim);

        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (v[j] <= pivo) {
                i++;
                trocar(v, i, j);
            }
        }

        trocar(v, i + 1, fim);
        return i + 1;
    }

    private static void trocar(int[] v, int a, int b) {
        int t = v[a]; v[a] = v[b]; v[b] = t;
    }
}
