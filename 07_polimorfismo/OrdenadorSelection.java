import java.util.Comparator;

public class OrdenadorSelection<T> implements Ordenador<T> {
    public void ordenar(T[] v, Comparator<T> c) {
        for (int i = 0; i < v.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (c.compare(v[j], v[menor]) < 0) menor = j;
            }
            T t = v[i]; v[i] = v[menor]; v[menor] = t;
        }
    }
}
