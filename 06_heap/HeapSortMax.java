public class HeapSortMax {
    public static void ordenar(int[] v) {
        int n = v.length;

        // Fase 1: construir Max Heap.
        // n/2 - 1 é o índice do último nó que pode ter filhos.
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(v, n, i);
        }

        // Fase 2: mandar o maior atual para o fim.
        for (int fim = n - 1; fim > 0; fim--) {
            trocar(v, 0, fim);

            // O índice fim e os posteriores já estão ordenados.
            // O heap ativo agora tem tamanho = fim.
            heapify(v, fim, 0);
        }
    }

    private static void heapify(int[] v, int tamanho, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < tamanho && v[esquerda] > v[maior]) {
            maior = esquerda;
        }

        if (direita < tamanho && v[direita] > v[maior]) {
            maior = direita;
        }

        if (maior != i) {
            trocar(v, i, maior);

            // O valor que desceu pode estar pequeno demais para a nova posição.
            heapify(v, tamanho, maior);
        }
    }

    private static void trocar(int[] v, int a, int b) {
        int t = v[a]; v[a] = v[b]; v[b] = t;
    }
}
