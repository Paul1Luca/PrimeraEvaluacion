import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos números");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("Ordenados en forma ascendente: " + num2 + " " + num1);
        } else {
            System.out.println("Ordenados de forma ascendente: " + num1 + " " + num2);
        }
    }
}
