public class InsertionProdutos {
    public static void ordenar(Produto[] v) {
        for (int i = 1; i < v.length; i++) {
            Produto chave = v[i];
            int j = i - 1;

            while (j >= 0 && v[j].valorVenda() > chave.valorVenda()) {
                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = chave;
        }
    }
}
