import java.util.Comparator;

public class OrdenadorBubble<T> implements Ordenador<T> {
    public void ordenar(T[] v, Comparator<T> c) {
        for (int fim = v.length - 1; fim > 0; fim--) {
            for (int j = 0; j < fim; j++) {
                if (c.compare(v[j], v[j + 1]) > 0) {
                    T t = v[j]; v[j] = v[j + 1]; v[j + 1] = t;
                }
            }
        }
    }
}
