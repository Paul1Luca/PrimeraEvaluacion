import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos números");
        int N = teclado.nextInt();
        int M = teclado.nextInt();
        int num = N;

        if (M > N) {
            do {
                System.out.println(M);
                M--;
            } while (M >= N);
        } else {
            N = M;
            M = num;
            do {
                System.out.println(M);
                M--;
            } while (M >= N);
        }
    }
}
