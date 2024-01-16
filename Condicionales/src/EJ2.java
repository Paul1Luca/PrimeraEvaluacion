import java.io.IOException;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre del producto");
        char nombre = (char) System.in.read();

        System.out.println("Introduce el precio");
        double precio = teclado.nextDouble();

        System.out.println("Introduce la cantidad");
        int cantidad = teclado.nextInt();
        
        double total = precio * cantidad;
        
        if (total > 10000 || nombre == 'A' || nombre == 'a'){
            System.out.println("Introduce el descuento");
            double descuento = teclado.nextDouble();
            
            double condesc = precio - (precio * (descuento / 100));
            System.out.printf("El total es %.2f", condesc);

        } else {
            System.out.printf("El total es de %.2f", total);
        }
    }
}
