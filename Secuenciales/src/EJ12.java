import java.io.IOException;
import java.util.Scanner;
public class EJ12 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra de 5 letras");
        char letra1 = (char) System.in.read();
        char letra2 = (char) System.in.read();
        char letra3 = (char) System.in.read();
        char letra4 = (char) System.in.read();
        char letra5 = (char) System.in.read();

        char letraa = (char) ((int) letra1 - 30);
        char letrab = (char) ((int) letra2 - 30);
        char letrac = (char) ((int) letra3 - 30);
        char letrad = (char) ((int) letra4 - 30);
        char letrae = (char) ((int) letra5 - 30);

        System.out.printf("%c %c %c %c %c", letraa, letrab, letrac, letrad, letrae);
    }
}
