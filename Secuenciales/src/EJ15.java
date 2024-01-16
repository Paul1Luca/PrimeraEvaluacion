import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu salario anterior");
        double salario = teclado.nextDouble();

        double total = salario + (salario * 0.25);
        System.out.printf("El total del salario es de %.2f", total);
    }
}
