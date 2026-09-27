import java.util.Arrays;

public class HeapSortPassoAPasso {
    public static void ordenar(int[] v) {
        int n = v.length;

        System.out.println("Original: " + Arrays.toString(v));

        for (int i = n / 2 - 1; i >= 0; i--) {
            System.out.println("heapify de construcao em i=" + i);
            heapify(v, n, i);
            System.out.println(Arrays.toString(v));
        }

        System.out.println("Max Heap pronto: " + Arrays.toString(v));

        for (int fim = n - 1; fim > 0; fim--) {
            System.out.printf("\nTroca raiz %d com v[%d]=%d%n", v[0], fim, v[fim]);
            trocar(v, 0, fim);
            System.out.println("Depois da troca: " + Arrays.toString(v));

            heapify(v, fim, 0);
            System.out.println("Heap restaurado: " + Arrays.toString(v));
        }
    }

    private static void heapify(int[] v, int tamanho, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < tamanho && v[esquerda] > v[maior]) maior = esquerda;
        if (direita < tamanho && v[direita] > v[maior]) maior = direita;

        if (maior != i) {
            System.out.printf("  troca pai v[%d]=%d com filho v[%d]=%d%n", i, v[i], maior, v[maior]);
            trocar(v, i, maior);
            heapify(v, tamanho, maior);
        }
    }

    private static void trocar(int[] v, int a, int b) {
        int t = v[a]; v[a] = v[b]; v[b] = t;
    }
}
