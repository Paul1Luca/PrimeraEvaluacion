import java.io.IOException;
import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un carácter");
        char caracter = (char) System.in.read();

        System.out.println("El código ASCII es " + (int)caracter);
    }
}
