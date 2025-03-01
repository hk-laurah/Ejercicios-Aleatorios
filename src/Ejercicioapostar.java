import java.util.Random;
import java.util.Scanner;

public class Ejercicioapostar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ale = new Random();

        int max = 3;
        int min = 1;
        int apuestas = 0;
        int duplica = 0;
        int pierde_mitad = 0;
        int pierde_todo = 0;
        double dinero;

        System.out.println("Ingrese la cantidad de dinero que quiere apostar:");
        dinero = scanner.nextDouble();

        boolean continuar = true;

        while (continuar) {
            int numero = ale.nextInt((max - min + 1)) + min;
            System.out.println("Número generado: " + numero);

            if (numero == 1) {
                System.out.println("Duplicaste tu dinero");
                dinero *= 2;
                duplica++;
            } else if (numero == 2) {
                System.out.println("Perdiste la mitad de tu dinero");
                dinero /= 2;
                pierde_mitad++;
            } else if (numero == 3) {
                System.out.println("Perdiste todo tu dinero");
                dinero = 0;
                pierde_todo++;
            }

            apuestas++;
            System.out.println("Dinero actual: $" + dinero);

            if (dinero == 0) {
                System.out.println("Te has quedado sin dinero. Fin del juego.");
                continuar = false;
            } else {
                System.out.println("¿Desea continuar? (1: si, 2: no)");
                int opcion = scanner.nextInt();
                if (opcion != 1) {
                    continuar = false;
                }
            }
        }

        scanner.close();
    }
}