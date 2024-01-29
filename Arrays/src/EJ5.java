public class EJ5 {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];
        int contador = 0;

        for (int i = 0; i < diagonal.length; i++, contador++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (i == contador && j == contador) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                System.out.printf("%d ", diagonal[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
