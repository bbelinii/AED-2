import java.util.Comparator;

public class OrdenadorMerge<T> implements Ordenador<T> {
    public void ordenar(T[] v, Comparator<T> c) {
        mergeSort(v, 0, v.length - 1, c);
    }

    private void mergeSort(T[] v, int inicio, int fim, Comparator<T> c) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, inicio, meio, c);
            mergeSort(v, meio + 1, fim, c);
            merge(v, inicio, meio, fim, c);
        }
    }

    @SuppressWarnings("unchecked")
    private void merge(T[] v, int inicio, int meio, int fim, Comparator<T> c) {
        Object[] temp = new Object[fim - inicio + 1];
        int i = inicio, j = meio + 1, k = 0;

        while (i <= meio && j <= fim) {
            if (c.compare(v[i], v[j]) <= 0) temp[k++] = v[i++];
            else temp[k++] = v[j++];
        }
        while (i <= meio) temp[k++] = v[i++];
        while (j <= fim) temp[k++] = v[j++];
        for (int t = 0; t < temp.length; t++) v[inicio + t] = (T) temp[t];
    }
}
