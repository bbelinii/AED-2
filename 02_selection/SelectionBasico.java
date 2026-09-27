public class SelectionBasico {
    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            int temp = v[i];
            v[i] = v[indiceMenor];
            v[indiceMenor] = temp;
        }
    }
}
