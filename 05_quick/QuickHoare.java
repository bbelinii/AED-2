public class QuickHoare {
    public static void ordenar(int[] v) {
        quickSort(v, 0, v.length - 1);
    }

    private static void quickSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int corte = particionar(v, inicio, fim);

            // Em Hoare, o corte não é necessariamente a posição final do pivô.
            quickSort(v, inicio, corte);
            quickSort(v, corte + 1, fim);
        }
    }

    private static int particionar(int[] v, int inicio, int fim) {
        int pivo = v[(inicio + fim) / 2];
        int i = inicio - 1;
        int j = fim + 1;

        while (true) {
            do { i++; } while (v[i] < pivo);
            do { j--; } while (v[j] > pivo);

            if (i >= j) return j;

            int temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
    }
}
