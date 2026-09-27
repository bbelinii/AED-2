public class SelectionDecrescente {
    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int indiceMaior = i;

            for (int j = i + 1; j < v.length; j++) {
                if (v[j] > v[indiceMaior]) {
                    indiceMaior = j;
                }
            }

            int temp = v[i];
            v[i] = v[indiceMaior];
            v[indiceMaior] = temp;
        }
    }
}
