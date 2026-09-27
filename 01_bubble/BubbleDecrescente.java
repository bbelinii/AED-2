public class BubbleDecrescente {
    public static void ordenar(int[] v) {
        for (int fim = v.length - 1; fim > 0; fim--) {
            for (int j = 0; j < fim; j++) {
                // Inverte o sinal para ordenar do maior para o menor.
                if (v[j] < v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }
}
