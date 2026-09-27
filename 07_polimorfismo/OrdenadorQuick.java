import java.util.Comparator;

public class OrdenadorQuick<T> implements Ordenador<T> {
    public void ordenar(T[] v, Comparator<T> c) {
        quickSort(v, 0, v.length - 1, c);
    }

    private void quickSort(T[] v, int inicio, int fim, Comparator<T> c) {
        if (inicio < fim) {
            int p = particionar(v, inicio, fim, c);
            quickSort(v, inicio, p - 1, c);
            quickSort(v, p + 1, fim, c);
        }
    }

    private int particionar(T[] v, int inicio, int fim, Comparator<T> c) {
        T pivo = v[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (c.compare(v[j], pivo) <= 0) {
                i++;
                T t = v[i]; v[i] = v[j]; v[j] = t;
            }
        }

        T t = v[i + 1]; v[i + 1] = v[fim]; v[fim] = t;
        return i + 1;
    }
}
