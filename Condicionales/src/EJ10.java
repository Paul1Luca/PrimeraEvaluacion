import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 3 números");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es el mayor");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " es el mayor");
        }
    }
}
