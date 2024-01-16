import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = teclado.nextInt();
        int N = num;

        for (int contador = 0; contador <= 10; contador++){
            num = N;
            num = num * contador;
            System.out.println(num);
        }
    }
}
