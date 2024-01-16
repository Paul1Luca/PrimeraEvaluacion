import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la cantidad de dinero");
        double dinero = teclado.nextDouble();

        int b10 = (int) ((double) dinero / 10);
        int b5 = (int) ((double) (dinero%10) / 5);
        int m50 = (int) ((double) (dinero%10%5) / 0.5);
        int m10 = (int) ((double) (dinero%10%5%0.5) / 0.1);
        int m5 = (int) ((double) (dinero%10%5%0.5%0.1) / 0.05);
        int m1 = (int) ((double) (dinero%10%5%0.5%0.1%0.05) / 0.01);


        System.out.println("El número de billetes de 10 es de " + b10);
        System.out.println("El número de billetes de 5 es de " + b5);
        System.out.println("El número de monedas de 50 es de " + m50);
        System.out.println("El número de monedas de 10 es de " + m10);
        System.out.println("El número de monedas de 5 es de " + m5);
        System.out.println("El número de monedas de 1 es de " + m1);
    }
}
