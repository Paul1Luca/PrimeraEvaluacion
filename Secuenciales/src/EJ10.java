import java.io.IOException;
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entre 32 y 255");
        int num = teclado.nextInt();

        System.out.printf("Su equvalente en carácter es %c", (char) num);


    }
}
