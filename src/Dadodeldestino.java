import java.util.Random;
import java.util.Scanner;

public class Dadodeldestino {

    public static void main(String[] args) {
        int vidas = 5;
        int puntos = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Dado del Destino");
        System.out.println("1 : pierde una vida ");
        System.out.println("2 o 4 : gana un punto");
        System.out.println("3 o 5 : no gana nada ");
        System.out.println("6 : gana 3 puntos");
        System.out.println("Tienes " + vidas + " vidas y " + puntos + " puntos.");

        while (vidas > 0 && puntos < 10) {
            System.out.println("Presiona ENTER para lanzar el dado");
            scanner.nextLine();
            int resultadoDado = random.nextInt(6) + 1;
            System.out.println("El dado cayó en: " + resultadoDado);

            switch (resultadoDado) {
                case 1:
                    vidas--;
                    System.out.println("Pierdes 1 vida. Vidas restantes: " + vidas);
                    break;
                case 2:
                case 4:
                    puntos++;
                    System.out.println("Ganas 1 punto! Puntos totales: " + puntos);
                    break;
                case 3:
                case 5:
                    System.out.println("No pasa nada. Puntos: " + puntos + ", Vidas: " + vidas);
                    break;
                case 6:
                    puntos += 3;
                    System.out.println("Ganas 3 puntos Puntos totales: " + puntos);
                    break;
            }
        }

        if (vidas <= 0) {
            System.out.println("Te has quedado sin vidas. Fin del juego.");
        } else if (puntos >= 10) {
            System.out.println("Felicidades Has alcanzado 10 puntos. ¡Ganaste!");
        }

        scanner.close();
    }
}
