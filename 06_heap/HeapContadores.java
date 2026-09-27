public class HeapContadores {
    private static long comparacoes;
    private static long trocas;

    public static void ordenar(int[] v) {
        comparacoes = 0;
        trocas = 0;
        int n = v.length;

        for (int i = n / 2 - 1; i >= 0; i--) heapify(v, n, i);

        for (int fim = n - 1; fim > 0; fim--) {
            trocar(v, 0, fim);
            heapify(v, fim, 0);
        }

        System.out.println("Comparacoes: " + comparacoes);
        System.out.println("Trocas: " + trocas);
    }

    private static void heapify(int[] v, int tamanho, int i) {
        int maior = i;
        int esq = 2 * i + 1;
        int dir = 2 * i + 2;

        if (esq < tamanho) {
            comparacoes++;
            if (v[esq] > v[maior]) maior = esq;
        }

        if (dir < tamanho) {
            comparacoes++;
            if (v[dir] > v[maior]) maior = dir;
        }

        if (maior != i) {
            trocar(v, i, maior);
            heapify(v, tamanho, maior);
        }
    }

    private static void trocar(int[] v, int a, int b) {
        trocas++;
        int t = v[a]; v[a] = v[b]; v[b] = t;
    }
}
