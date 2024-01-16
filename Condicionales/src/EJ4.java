import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los tres lados del triángulo");
        double lado1 = teclado.nextDouble();
        double lado2 = teclado.nextDouble();
        double lado3 = teclado.nextDouble();

        if (lado3 < lado1 + lado2 && lado2 < lado1 + lado3 && lado1 < lado2 + lado3) {
            System.out.println("Se puede hacer un triángulo");
        } else {
            System.out.println("No se puede formar el triángulo");
        }

    }
}
