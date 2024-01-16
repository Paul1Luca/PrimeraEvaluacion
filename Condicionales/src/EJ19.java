import java.util.Scanner;

public class EJ19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el tiempo en segundos");
        int segundos = teclado.nextInt();

        if (segundos > 59) {
            int minutos = segundos / 60;
            segundos = segundos % 60;

            if (minutos > 59) {
                int horas = minutos / 60;
                minutos = segundos / 60;
                segundos = segundos % 60;

                if (horas > 23) {
                    int dias = horas / 24;
                    horas = minutos / 60;
                    minutos = segundos / 60;
                    segundos = segundos % 60;

                    if (dias > 6) {
                        int semanas = dias / 7;
                        dias = horas / 24;
                        horas = minutos / 60;
                        minutos = segundos / 60;
                        segundos = segundos % 60;

                        System.out.println("Segundos: " + segundos);
                        System.out.println("Minutos: " + minutos);
                        System.out.println("Horas: " + horas);
                        System.out.println("Dias: " + dias);
                        System.out.println("Semanas: " + semanas);

                    }else {
                        System.out.println("Segundos: " + segundos);
                        System.out.println("Minutos: " + minutos);
                        System.out.println("Horas: " + horas);
                        System.out.println("Dias: " + dias);
                    }
                }else {
                    System.out.println("Segundos: " + segundos);
                    System.out.println("Minutos: " + minutos);
                    System.out.println("Horas: " + horas);
                }
            } else {
                System.out.println("Segundos: " + segundos);
                System.out.println("Minutos: " + minutos);
            }
        } else {
            System.out.println("Segundos: " + segundos);
        }
    }
}
