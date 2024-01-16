import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un dividendo y un divisor");
        int dividendo = teclado.nextInt();
        int divisor = teclado.nextInt();

        if (dividendo%divisor == 0) {
            System.out.println("Los números son divisibles");
        } else {
            System.out.println("Los números no so divisibles");
        }
    }
}
