import java.util.Scanner;

public class EJ20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el precio de la compra");
        double precio = teclado.nextDouble();

        if (precio < 10) {
            System.out.println("No hay descuento");
        } else if (precio >= 10 && precio <= 30) {
            double desc1 = precio * 0.1;
            double total1 = precio - desc1;
            System.out.printf("El descuento es de %.2f y el precio final es de %.2f", desc1, total1);
        } else {
            double desc1 = precio * 0.1;
            double total1 = precio - desc1;
            double desc2 = total1 * 0.2;
            double totaldesc = desc1 + desc2;
            double total2 = precio - desc1 - desc2;
            System.out.printf("El descuento es de %.2f y el precio final es de %.2f", totaldesc, total2);
        }
    }
}
