import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int max = 10;
        int min = 1;
        int rondas, d1, d2;
        int contD1 = 0, contD2 = 0;
        Random ale = new Random();

        rondas = ale.nextInt((10 - 1 + 1)) + min;
        System.out.println("CANTIDAD DE RONDAS: " + rondas);

        for (int i = 1; i <= rondas; i++) {

            d1 = ale.nextInt((10 - 1 + 1)) + min;
            d2 = ale.nextInt((10 - 1 + 1)) + min;
            contD1 += d1;
            contD2 += d2;

            System.out.println();
            System.out.println("D1:" + d1);
            System.out.println("D2:" + d2);
            System.out.println();

            if (contD1 > contD2) {
                System.out.println("GANA D1");
            } else {
                System.out.println("GANA D2");
            }
        }

        System.out.println("SUMA DE D1: " + contD1);
        System.out.println("SUMA DE D2: " + contD2);
    }
}