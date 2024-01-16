import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el precio");
        double precio = teclado.nextDouble();

        System.out.println("Introduce el descuento");
        double descuento = teclado.nextDouble();

        if (precio > 100) {
            double mayor = precio - (precio * 0.15);
            System.out.printf("El precio final con descuento es de %.2f", mayor);
        } else {
            double menor = precio - (precio * (descuento / 100));
            System.out.printf("El precio final con descuento es de %.2f", menor);
        }
    }
}
