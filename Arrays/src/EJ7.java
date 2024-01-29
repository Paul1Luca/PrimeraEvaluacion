public class EJ7 {
    public static void main(String[] args) {
        int[] numeros = new int[30];
        int positivos = 0;
        int negativos = 0;
        int nulos = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 20 + (-10));
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                nulos++;
            } else if (numeros[i] > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d, ", numeros[i]);
        }
        System.out.printf("%n");
        System.out.printf("Positivos = %d\nNegativos = %d\nNulos = %d", positivos, negativos, nulos);
    }
}
