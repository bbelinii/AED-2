public class QuickDecrescente {
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
        int pivo = v[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            // >= faz os maiores ficarem à esquerda.
            if (v[j] >= pivo) {
                i++;
                int t = v[i]; v[i] = v[j]; v[j] = t;
            }
        }

        int t = v[i + 1]; v[i + 1] = v[fim]; v[fim] = t;
        return i + 1;
    }
}
