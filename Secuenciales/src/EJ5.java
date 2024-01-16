import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el valor de los catetos");
        int cat1 = teclado.nextInt();
        int cat2 = teclado.nextInt();

        int hipotenusa = (int) Math.hypot(cat1, cat2);

        System.out.println("La hipotenusa del triángulo es " + hipotenusa);
    }
}
