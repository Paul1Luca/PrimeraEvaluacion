import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos números");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            if (num1 % num2 == 0) {
                int resta = num1 - num2;
                System.out.println("La resta da " + resta);
            } else {
                System.out.println("No es divisible");
            }
        } else {
            if (num2 % num1 == 0) {
                int suma = num1 + num2;
                System.out.println("La suma da " + suma);
            } else {
                System.out.println("No es divisible");
            }
        }
    }
}
