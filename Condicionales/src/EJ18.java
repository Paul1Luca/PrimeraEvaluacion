import java.io.IOException;
import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos números y un carácter que sea A, B, C o D");
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        char L = (char) System.in.read();

        if (L == 'A') {
            double perimetro = 2 * (A + B);
            System.out.printf("El perímetro de un rectángulo es %.2f", perimetro);
        } else if (L == 'B') {
            double arearec = A * B;
            System.out.printf("El área de un rectángulo es %.2f", arearec);
        } else if (L == 'C') {
            double areatri = A*B/2;
            System.out.printf("El área de un triángulo es %.2f", areatri);
        } else if (L == 'D') {
            double hipotenusa = Math.pow(A, B);
            System.out.printf("El hipotenusa de un triángulo es %.2f", hipotenusa);
        }
    }
}
