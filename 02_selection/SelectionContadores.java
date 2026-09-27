public class SelectionContadores {
    public static void ordenar(int[] v) {
        int comparacoes = 0;
        int trocas = 0;

        for (int i = 0; i < v.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < v.length; j++) {
                comparacoes++;
                if (v[j] < v[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (indiceMenor != i) {
                int temp = v[i];
                v[i] = v[indiceMenor];
                v[indiceMenor] = temp;
                trocas++;
            }
        }

        System.out.println("Comparacoes: " + comparacoes);
        System.out.println("Trocas: " + trocas);
    }
}
