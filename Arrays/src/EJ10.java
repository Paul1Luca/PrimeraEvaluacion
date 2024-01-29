import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la lista");
        int dimension = teclado.nextInt();
        int num1 = 0;

        int[] numeros = new int[dimension];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 30 + 0);
            System.out.printf("%d, ", numeros[i]);
            num1 = numeros[dimension - 1];
        }

        System.out.println("");
        System.out.println("Se han cambiado el " + numeros[0] + " y el " + numeros[dimension - 1]);

        numeros[dimension - 1] = numeros[0];
        numeros[0] = num1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d, ", numeros[i]);
        }

    }
}
