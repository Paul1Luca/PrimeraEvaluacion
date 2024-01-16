import java.io.IOException;
import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos números");
        int A = teclado.nextInt();
        int B = teclado.nextInt();

        System.out.println("Introduce un símbolo: +, -, / o *");
        char S = (char) System.in.read();

        if (!(S == '+' || S == '-' || S == '/' || S == '*')) {
            System.out.println("No es válido");
        }else if (S == '+') {
            double calculo = A + B;
            System.out.printf("La suma da %.2f", calculo);
        }else if (S == '-') {
            double calculo = A - B;
            System.out.printf("La resta da %.2f", calculo);
        }else if (S == '/') {
            double calculo = A / B;
            System.out.printf("La división da %.2f", calculo);
        }else if (S == '*') {
            double calculo = A * B;
            System.out.printf("La multiplicación da %.2f", calculo);
        }
    }
}
