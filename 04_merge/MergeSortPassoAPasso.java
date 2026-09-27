import java.util.Arrays;

public class MergeSortPassoAPasso {
    public static void ordenar(int[] v) {
        mergeSort(v, 0, v.length - 1);
    }

    private static void mergeSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            System.out.printf("Dividindo [%d..%d] em [%d..%d] e [%d..%d]%n",
                    inicio, fim, inicio, meio, meio + 1, fim);

            mergeSort(v, inicio, meio);
            mergeSort(v, meio + 1, fim);
            merge(v, inicio, meio, fim);

            System.out.println("Depois do merge: " + Arrays.toString(v));
        }
    }

    private static void merge(int[] v, int inicio, int meio, int fim) {
        int[] temp = new int[fim - inicio + 1];
        int i = inicio, j = meio + 1, k = 0;

        while (i <= meio && j <= fim) {
            if (v[i] <= v[j]) temp[k++] = v[i++];
            else temp[k++] = v[j++];
        }

        while (i <= meio) temp[k++] = v[i++];
        while (j <= fim) temp[k++] = v[j++];

        for (int t = 0; t < temp.length; t++) v[inicio + t] = temp[t];
    }
}
