import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el precio y la cantidad de producto");
        double precio = teclado.nextDouble();
        int cantidad = teclado.nextInt();

        double total = precio * cantidad;

        System.out.printf("El precio es de %.2f y la cantidad es %d por lo que el total es %.2f", precio, cantidad, total);

    }


}
