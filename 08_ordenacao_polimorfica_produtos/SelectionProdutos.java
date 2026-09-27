public class SelectionProdutos {
    public static void ordenar(Produto[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < v.length; j++) {
                if (v[j].valorVenda() < v[indiceMenor].valorVenda()) {
                    indiceMenor = j;
                }
            }

            trocar(v, i, indiceMenor);
        }
    }

    private static void trocar(Produto[] v, int a, int b) {
        Produto temp = v[a];
        v[a] = v[b];
        v[b] = temp;
    }
}
