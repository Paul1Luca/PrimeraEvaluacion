import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el dinero invertido de cada uno");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        double num3 = teclado.nextDouble();

        double total = num1 + num2 + num3;
        double porcentaje1 = num1 / total * 100;
        double porcentaje2 = num2 / total * 100;
        double porcentaje3 = num3 / total * 100;

        System.out.printf("EL porcentaje del inversor 1 es %.2f%nEL del inversor 2 es %.2f%nEl del inversor 3 es %.2f%n", porcentaje1, porcentaje2, porcentaje3);
    }
}
