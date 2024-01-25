public class EJ3 {
    public static void main(String[] args) {
        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*15 + 1);
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Valores = " + numeros[i]);
        }
    }
}
