import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos números enteros");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);

    }

}
