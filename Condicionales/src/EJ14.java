import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 4 números");
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();

        if (!(B == 0 || D == 0)) {
            if (A / B > C / D) {
                int suma1 = A + B + C + D;
                System.out.println("La suma de los números es " + suma1);
            } else {
                int suma2 = B + D;
                System.out.println("La suma del segundo y cuarto número es " + suma2);
            }
        } else {
            System.out.println("No se puede dividir por 0");
        }
    }
}
