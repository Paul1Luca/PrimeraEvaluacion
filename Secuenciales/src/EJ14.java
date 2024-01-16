import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la nota promedio de las parciales");
        double promedio = teclado.nextDouble();

        System.out.println("Introduce la nota del trabajo final");
        double trabajo = teclado.nextDouble();

        System.out.println("Introduce la nota de examen");
        double examen = teclado.nextDouble();

        double nota = (promedio * 0.55) + (trabajo * 0.3) + (examen * 0.15);

        System.out.printf("La calificación final es de %.2f", nota);
    }
}
