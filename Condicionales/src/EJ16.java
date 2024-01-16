import java.io.IOException;
import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el tipo de zanahoria");
        char tipo = (char) System.in.read();

        System.out.println("Introduce la cantidad");
        int cantidad = teclado.nextInt();

        if (tipo == 'A' || tipo == 'a') {
            double total = 1.5 * cantidad;
            System.out.printf("EL total de la compra es: %.2f", total);
        }else if (tipo == 'B' || tipo == 'b') {
            double total = 1.8 * cantidad;
            System.out.printf("EL total de la compra es: %.2f", total);
        }else if (tipo == 'C' || tipo == 'c') {
            double total = 2.1 * cantidad;
            System.out.printf("EL total de la compra es: %.2f", total);
        }else if (tipo == 'D' || tipo == 'd') {
            double total = 2.5 * cantidad;
            System.out.printf("EL total de la compra es: %.2f", total);
        }else if (tipo == 'F' || tipo == 'f') {
            double total = 3.2 * cantidad;
            System.out.printf("EL total de la compra es: %.2f", total);
        }
    }
}
