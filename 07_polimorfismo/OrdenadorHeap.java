import java.util.Comparator;

public class OrdenadorHeap<T> implements Ordenador<T> {
    public void ordenar(T[] v, Comparator<T> c) {
        int n = v.length;

        for (int i = n / 2 - 1; i >= 0; i--) heapify(v, n, i, c);

        for (int fim = n - 1; fim > 0; fim--) {
            T t = v[0]; v[0] = v[fim]; v[fim] = t;
            heapify(v, fim, 0, c);
        }
    }

    private void heapify(T[] v, int tamanho, int i, Comparator<T> c) {
        int maior = i;
        int esq = 2 * i + 1;
        int dir = 2 * i + 2;

        if (esq < tamanho && c.compare(v[esq], v[maior]) > 0) maior = esq;
        if (dir < tamanho && c.compare(v[dir], v[maior]) > 0) maior = dir;

        if (maior != i) {
            T t = v[i]; v[i] = v[maior]; v[maior] = t;
            heapify(v, tamanho, maior, c);
        }
    }
}
