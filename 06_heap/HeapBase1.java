public class HeapBase1 {
    // Exemplo acadêmico em que o índice 0 não é usado.
    // Para pai i: esquerda=2*i, direita=2*i+1.

    public static void heapify(int[] v, int tamanho, int i) {
        int maior = i;
        int esquerda = 2 * i;
        int direita = 2 * i + 1;

        if (esquerda <= tamanho && v[esquerda] > v[maior]) maior = esquerda;
        if (direita <= tamanho && v[direita] > v[maior]) maior = direita;

        if (maior != i) {
            int t = v[i]; v[i] = v[maior]; v[maior] = t;
            heapify(v, tamanho, maior);
        }
    }
}
