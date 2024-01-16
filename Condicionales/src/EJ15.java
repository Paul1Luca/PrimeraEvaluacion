import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el año");
        int num1 = teclado.nextInt();

        if (num1 % 4 == 0) {
            if (!(num1 % 100 == 0)) {
                System.out.println("Es un año bisiesto");
            } else {
                if (num1 % 400 == 0) {
                    System.out.println("Es un año bisiesto");
                } else {
                    System.out.println("No es bisiesto");
                }
            }
        } else {
            System.out.println("No es bisiesto");
        }
    }
}
