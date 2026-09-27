public class HeapifyIterativo {
    public static void heapify(int[] v, int tamanho, int i) {
        // Mesma lógica do heapify recursivo, mas usando while.
        while (true) {
            int maior = i;
            int esquerda = 2 * i + 1;
            int direita = 2 * i + 2;

            if (esquerda < tamanho && v[esquerda] > v[maior]) maior = esquerda;
            if (direita < tamanho && v[direita] > v[maior]) maior = direita;

            if (maior == i) {
                return; // pai já é o maior: heap está correto neste caminho.
            }

            int t = v[i]; v[i] = v[maior]; v[maior] = t;

            // Continua verificando a posição para onde o antigo pai desceu.
            i = maior;
        }
    }
}
