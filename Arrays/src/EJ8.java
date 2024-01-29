import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[20];
        int contador = 0;
        int posicion = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
            if (numeros[i] > contador) {
                contador = numeros [i];
                posicion = i;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d, ", numeros[i]);
        }
        System.out.printf("%n");
        System.out.println("El número mayor es " + contador + " y su posición era la nº " + posicion + " del array");

    }
}
