import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 15 números");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d ", numeros[i]);
        }

        System.out.printf("%n");

        for (int i = 14; i >=0 ; i--) {
            System.out.printf("%d ", numeros[i]);
        }
    }
}
