public class EJ9 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10 + 0);
            if (i%2 == 0) {
                suma = suma + numeros[i];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d, ", numeros[i]);
        }
        System.out.printf("%n");
        System.out.println("La suma de los números en posición par dan como resultado "+ suma);
    }
}
