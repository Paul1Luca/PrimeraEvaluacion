public class EJ4 {
    public static void main(String[] args) {
        int[][] numeros = new int[10][10];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i % 2 == 0) {
                    numeros[i][j] = 1;
                } else {
                    numeros[i][j] = 0;
                }
            }

        }
        for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[i].length; j++) {
                    System.out.printf("%d", numeros[i][j]);
                }
            System.out.printf("\n");
        }
    }
}
