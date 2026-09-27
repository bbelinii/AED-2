public class HeapProdutos {
    public static void ordenar(Produto[] v) {
        int n = v.length;

        // 1) construir Max Heap pelo valor de venda
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(v, n, i);
        }

        // 2) mandar o maior valor para o final
        for (int fim = n - 1; fim > 0; fim--) {
            trocar(v, 0, fim);
            heapify(v, fim, 0);
        }
    }

    private static void heapify(Produto[] v, int tamanho, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < tamanho &&
            v[esquerda].valorVenda() > v[maior].valorVenda()) {
            maior = esquerda;
        }

        if (direita < tamanho &&
            v[direita].valorVenda() > v[maior].valorVenda()) {
            maior = direita;
        }

        if (maior != i) {
            trocar(v, i, maior);
            heapify(v, tamanho, maior);
        }
    }

    private static void trocar(Produto[] v, int a, int b) {
        Produto temp = v[a];
        v[a] = v[b];
        v[b] = temp;
    }
}
