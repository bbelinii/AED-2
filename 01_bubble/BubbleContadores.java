public class BubbleContadores {
    public static void ordenar(int[] v) {
        int comparacoes = 0;
        int trocas = 0;

        for (int fim = v.length - 1; fim > 0; fim--) {
            for (int j = 0; j < fim; j++) {
                comparacoes++;
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    trocas++;
                }
            }
        }

        System.out.println("Comparacoes: " + comparacoes);
        System.out.println("Trocas: " + trocas);
    }
}
