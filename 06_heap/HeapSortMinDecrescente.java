public class HeapSortMinDecrescente {
    public static void ordenar(int[] v) {
        int n = v.length;

        // Min Heap -> menor fica na raiz.
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyMin(v, n, i);
        }

        // Mandando o menor para o fim, o resultado final fica decrescente.
        for (int fim = n - 1; fim > 0; fim--) {
            int t = v[0]; v[0] = v[fim]; v[fim] = t;
            heapifyMin(v, fim, 0);
        }
    }

    private static void heapifyMin(int[] v, int tamanho, int i) {
        int menor = i;
        int esq = 2 * i + 1;
        int dir = 2 * i + 2;

        if (esq < tamanho && v[esq] < v[menor]) menor = esq;
        if (dir < tamanho && v[dir] < v[menor]) menor = dir;

        if (menor != i) {
            int t = v[i]; v[i] = v[menor]; v[menor] = t;
            heapifyMin(v, tamanho, menor);
        }
    }
}
