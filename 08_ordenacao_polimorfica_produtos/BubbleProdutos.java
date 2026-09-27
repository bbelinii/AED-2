public class BubbleProdutos {
    public static void ordenar(Produto[] v) {
        for (int fim = v.length - 1; fim > 0; fim--) {
            for (int j = 0; j < fim; j++) {
                if (v[j].valorVenda() > v[j + 1].valorVenda()) {
                    trocar(v, j, j + 1);
                }
            }
        }
    }

    private static void trocar(Produto[] v, int a, int b) {
        Produto temp = v[a];
        v[a] = v[b];
        v[b] = temp;
    }
}
