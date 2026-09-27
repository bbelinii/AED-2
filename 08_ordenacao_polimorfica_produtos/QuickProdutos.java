public class QuickProdutos {
    public static void ordenar(Produto[] v) {
        quickSort(v, 0, v.length - 1);
    }

    private static void quickSort(Produto[] v, int inicio, int fim) {
        if (inicio < fim) {
            int p = particionar(v, inicio, fim);
            quickSort(v, inicio, p - 1);
            quickSort(v, p + 1, fim);
        }
    }

    private static int particionar(Produto[] v, int inicio, int fim) {
        Produto pivo = v[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (v[j].valorVenda() <= pivo.valorVenda()) {
                i++;
                trocar(v, i, j);
            }
        }

        trocar(v, i + 1, fim);
        return i + 1;
    }

    private static void trocar(Produto[] v, int a, int b) {
        Produto temp = v[a];
        v[a] = v[b];
        v[b] = temp;
    }
}
