import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el total de tú compra");
        double compra = teclado.nextDouble();
        double descuento = compra * 0.15;
        double total = compra - descuento;

        System.out.printf("El descuento es de %.2f %nEl total de la compra es de %.2f ", descuento, total);
    }
}
