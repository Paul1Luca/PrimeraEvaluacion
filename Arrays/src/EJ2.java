public class EJ2 {
    public static void main(String[] args) {
        int[] origen = {10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32};
        int[] destino = new int[12];

        for (int i = 0; i < origen.length ; i++) {
            if (origen[i]%2 == 0 && origen[i] > 25) {
                destino[i] = origen[i];
            }
        }

        for (int i = 0; i < origen.length; i++) {
            System.out.println("El array origen tiene " + origen[i]);
        }

        for (int i = 0; i < destino.length; i++) {
            System.out.println("El array destino tiene " + destino[i]);
        }
    }
}
