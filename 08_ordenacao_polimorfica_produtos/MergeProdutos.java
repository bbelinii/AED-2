public class MergeProdutos {
    public static void ordenar(Produto[] v) {
        mergeSort(v, 0, v.length - 1);
    }

    private static void mergeSort(Produto[] v, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, inicio, meio);
            mergeSort(v, meio + 1, fim);
            intercalar(v, inicio, meio, fim);
        }
    }

    private static void intercalar(Produto[] v, int inicio, int meio, int fim) {
        Produto[] aux = new Produto[fim - inicio + 1];
        int i = inicio;
        int j = meio + 1;
        int k = 0;

        while (i <= meio && j <= fim) {
            if (v[i].valorVenda() <= v[j].valorVenda()) {
                aux[k++] = v[i++];
            } else {
                aux[k++] = v[j++];
            }
        }

        while (i <= meio) aux[k++] = v[i++];
        while (j <= fim) aux[k++] = v[j++];

        for (int x = 0; x < aux.length; x++) {
            v[inicio + x] = aux[x];
        }
    }
}
