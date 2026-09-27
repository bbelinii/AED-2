import java.util.Comparator;

public class OrdenadorInsertion<T> implements Ordenador<T> {
    public void ordenar(T[] v, Comparator<T> c) {
        for (int i = 1; i < v.length; i++) {
            T chave = v[i];
            int j = i - 1;
            while (j >= 0 && c.compare(v[j], chave) > 0) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }
    }
}
