import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud de los lados");
        double L1 = teclado.nextDouble();
        double L2 = teclado.nextDouble();

        double P = 2 * (L1 + L2);
        double A = L1 * L2;
        double D = Math.sqrt((L1 * L1) + (L2 * L2));
        double AT = ((L1 * L2) / 2);

        System.out.printf("El perímetro del rectángulo es %.2f %n", P);
        System.out.printf("El área del rectángulo es %.2f %n", A);
        System.out.printf("El diagonal del rectángulo es %.2f %n", D);
        System.out.printf("El área del triángulo del rectángulo es %.2f %n", AT);
    }
}
