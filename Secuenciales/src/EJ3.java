import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 3 números");
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();

        int D = ((A + B) / C);

        System.out.println("El cálculo de sus números da como resultado " + D);
    }
}
