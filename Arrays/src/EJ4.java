public class EJ4 {
    public static void main(String[] args) {
        int[][] bidimensional = new int[10][10];

        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                if (i%2 == 0) {
                    bidimensional[i][j] = 1;
                } else {
                    bidimensional[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                System.out.printf("%d ", bidimensional[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
