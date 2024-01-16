import java.io.IOException;
import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce todos los números que quieras y termina con un .");
        int num;
        int contador = 0;
        char punto;
        int mayor = 0;

        do {
            num = teclado.nextInt();
            //System.in.read();
            if (mayor < num){
                mayor = num;
            }
            contador++;
            System.out.println("Para terminar introduzca . (para continuar cualquier caracter)");
            punto = (char) System.in.read();
            System.out.println((int)punto);
        }while (!(punto == '.'));
        System.out.println("EL número mayor es " + mayor);
        System.out.println("Has introducido " + contador + " números");
    }
}
