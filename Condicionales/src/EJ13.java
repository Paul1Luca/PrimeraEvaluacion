import java.io.IOException;
import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una letra");
        char letra = (char) System.in.read();

        if (letra > 96 && letra < 123 ) {
            System.out.println("Es minúscula");
        } else if (letra > 64 && letra < 91) {
            System.out.println("La letra es mayúscula");
        } else {
            System.out.println("No es una letra");
        }
    }
}