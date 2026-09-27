import java.util.Arrays;

public class QuickLomutoPassoAPasso {
    public static void ordenar(int[] v) {
        quickSort(v, 0, v.length - 1, 0);
    }

    private static void quickSort(int[] v, int inicio, int fim, int nivel) {
        if (inicio < fim) {
            String espaco = "  ".repeat(nivel);
            System.out.printf("%squickSort(%d, %d) %s%n", espaco, inicio, fim, Arrays.toString(v));

            int p = particionar(v, inicio, fim, espaco);
            System.out.printf("%sPivo terminou em %d%n", espaco, p);

            quickSort(v, inicio, p - 1, nivel + 1);
            quickSort(v, p + 1, fim, nivel + 1);
        }
    }

    private static int particionar(int[] v, int inicio, int fim, String espaco) {
        int pivo = v[fim];
        int i = inicio - 1;

        System.out.println(espaco + "Pivo = " + pivo);

        for (int j = inicio; j < fim; j++) {
            System.out.printf("%sj=%d, i=%d, comparando %d <= %d%n", espaco, j, i, v[j], pivo);

            if (v[j] <= pivo) {
                i++;
                trocar(v, i, j);
                System.out.println(espaco + "  menor/igual -> " + Arrays.toString(v));
            }
        }

        trocar(v, i + 1, fim);
        System.out.println(espaco + "Pivo colocado em i+1 -> " + Arrays.toString(v));
        return i + 1;
    }

    private static void trocar(int[] v, int a, int b) {
        int temp = v[a];
        v[a] = v[b];
        v[b] = temp;
    }
}
