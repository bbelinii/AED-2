public class InsertionContadores {
    public static void ordenar(int[] v) {
        int comparacoes = 0;
        int deslocamentos = 0;

        for (int i = 1; i < v.length; i++) {
            int chave = v[i];
            int j = i - 1;

            while (j >= 0) {
                comparacoes++;
                if (v[j] <= chave) break;
                v[j + 1] = v[j];
                deslocamentos++;
                j--;
            }
            v[j + 1] = chave;
        }

        System.out.println("Comparacoes: " + comparacoes);
        System.out.println("Deslocamentos: " + deslocamentos);
    }
}
