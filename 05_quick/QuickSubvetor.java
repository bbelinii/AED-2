public class QuickSubvetor {
    public static void ordenar(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int p = particionar(v, inicio, fim);
            ordenar(v, inicio, p - 1);
            ordenar(v, p + 1, fim);
        }
    }

    private static int particionar(int[] v, int inicio, int fim) {
        int pivo = v[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (v[j] <= pivo) {
                i++;
                int t = v[i]; v[i] = v[j]; v[j] = t;
            }
        }
        int t = v[i + 1]; v[i + 1] = v[fim]; v[fim] = t;
        return i + 1;
    }
}
