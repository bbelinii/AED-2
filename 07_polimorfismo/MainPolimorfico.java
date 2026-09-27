import java.util.Arrays;
import java.util.Comparator;

public class MainPolimorfico {
    public static void main(String[] args) {
        Aluno[] alunos = {
            new Aluno("Carlos", 7.5),
            new Aluno("Ana", 9.0),
            new Aluno("Bruno", 6.5)
        };

        Comparator<Aluno> porNota = Comparator.comparingDouble(Aluno::getNota);
        Comparator<Aluno> porNome = Comparator.comparing(Aluno::getNome);

        // A variável é do tipo da interface.
        // Podemos trocar o algoritmo sem alterar o restante do programa.
        Ordenador<Aluno> ordenador = new OrdenadorQuick<>();
        ordenador.ordenar(alunos, porNota);
        System.out.println("Quick por nota: " + Arrays.toString(alunos));

        ordenador = new OrdenadorHeap<>();
        ordenador.ordenar(alunos, porNome);
        System.out.println("Heap por nome: " + Arrays.toString(alunos));

        ordenador = new OrdenadorMerge<>();
        ordenador.ordenar(alunos, porNota.reversed());
        System.out.println("Merge por nota decrescente: " + Arrays.toString(alunos));
    }
}
