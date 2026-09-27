public class BubbleBasico {
    public static void ordenar(int[] v) {
        for (int fim = v.length - 1; fim > 0; fim--) {
            for (int j = 0; j < fim; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }
}
