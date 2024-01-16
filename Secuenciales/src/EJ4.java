import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = teclado.nextInt();

        int cuadrado = num * num;

        System.out.println("EL cuadrado de su número es " + cuadrado);
    }
}
