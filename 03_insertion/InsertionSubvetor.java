public class InsertionSubvetor {
    public static void ordenar(int[] v, int inicio, int fim) {
        // Útil em provas que pedem ordenação apenas de uma faixa do vetor.
        for (int i = inicio + 1; i <= fim; i++) {
            int chave = v[i];
            int j = i - 1;

            while (j >= inicio && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = chave;
        }
    }
}
