import java.util.Comparator;

public interface Ordenador<T> {
    void ordenar(T[] vetor, Comparator<T> comparador);
}
