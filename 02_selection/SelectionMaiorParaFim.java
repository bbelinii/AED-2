public class SelectionMaiorParaFim {
    public static void ordenar(int[] v) {
        // Mesma ideia do Selection, mas preenchendo o vetor da direita para a esquerda.
        for (int fim = v.length - 1; fim > 0; fim--) {
            int indiceMaior = 0;

            for (int j = 1; j <= fim; j++) {
                if (v[j] > v[indiceMaior]) {
                    indiceMaior = j;
                }
            }

            int temp = v[fim];
            v[fim] = v[indiceMaior];
            v[indiceMaior] = temp;
        }
    }
}
