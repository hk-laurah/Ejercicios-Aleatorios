import java.util.Scanner;
import java.util.Random;

public class  Adivina {
    public static void main(String[] args) {
        Random ale = new Random();
        int numeroGanador = ale.nextInt(50) + 1;
        int intentos = 3;
        boolean adivinado = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivina el número (1-50). Tienes 3 intentos.");
        while (intentos > 0 && !adivinado) {
            System.out.print("Intento: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroGanador) {
                System.out.println("¡Correcto! Ganaste.");
                adivinado = true;
            } else if (numeroUsuario < numeroGanador) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }

            intentos--;

            if (!adivinado && intentos > 0) {
                System.out.println("Te quedan " + intentos + " intentos.");
            }
        }

        if (!adivinado) {
            System.out.println("Perdiste. El número era: " + numeroGanador);
        }

        scanner.close();
    }
}