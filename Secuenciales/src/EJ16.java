import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el precio del producto");
        double precio = teclado.nextDouble();

        double venta = precio + (precio * 0.3);
        System.out.printf("El total por el que debería vender el producto es %.2f", venta);
    }
}
