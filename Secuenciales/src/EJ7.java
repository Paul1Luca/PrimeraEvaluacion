import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el radio");
        double R = teclado.nextDouble();

        double A = Math.PI * Math.pow(R, 2);
        double L = 2 + Math.PI + R;

        System.out.printf("El área es %.2f %n", A);
        System.out.printf("La longitud es %.2f %n", L);
    }
}
