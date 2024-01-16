import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 3 números");
        int N = teclado.nextInt();
        int M = teclado.nextInt();
        int Y = teclado.nextInt();
        int num = N;

        if (M < N) {
            N = M;
            M = num;
            do {
                System.out.println(M);
                M = M - Y;
            } while (M >= N);
        } else {
            do {
                System.out.println(M);
                M = M - Y;
            } while (M >= N);
        }
    }
}
