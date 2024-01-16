import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos números");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 == num2){
            System.out.println(num1 + " = " + num2);
        } else {
            System.out.println(num2 + " > " + num1);
        }
    }
}
