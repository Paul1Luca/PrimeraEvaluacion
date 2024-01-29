import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la lista");
        int dimension = teclado.nextInt();

        int[] numeros = new int[dimension];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 30 + 0);
            System.out.printf("%d, ", numeros[i]);
        }
    }
}
