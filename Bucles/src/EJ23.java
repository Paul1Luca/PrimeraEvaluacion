import java.io.IOException;
import java.util.Scanner;

public class EJ23 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase que termine en .");
        char N;

        do{
            N = (char) System.in.read();
            System.out.printf("%c", N);
        }while(!(N == '.'));
    }
}
