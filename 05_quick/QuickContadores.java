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
