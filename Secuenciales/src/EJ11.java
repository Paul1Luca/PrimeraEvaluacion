import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce las pulgadas");
        double pulgadas = teclado.nextDouble();

        double centimetros = pulgadas / 2.54;

        System.out.printf("El equivalente en centímetros es %.2fcm", centimetros);
    }
}
