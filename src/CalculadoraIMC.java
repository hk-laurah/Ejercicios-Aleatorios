import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, introduce tu peso en kilogramos:");
        double masa = entrada.nextDouble();
        System.out.println("Ahora, introduce tu altura en metros:");
        double altura = entrada.nextDouble();

        double IMC = masa / (altura * altura);

        System.out.printf("Tu Índice de Masa Corporal (IMC) es: %.2f%n", IMC);

        if (IMC < 18.5) {
            System.out.println("Estás en la categoría de peso bajo.");
        } else if (IMC <= 24.9) {
            System.out.println("Tu peso está dentro del rango normal.");
        } else if (IMC <= 26.9) {
            System.out.println("Tienes sobrepeso de nivel I.");
        } else if (IMC <= 29.9) {
            System.out.println("Tienes sobrepeso de nivel II.");
        } else if (IMC <= 34.9) {
            System.out.println("Tienes obesidad de tipo I.");
        } else if (IMC <= 39.9) {
            System.out.println("Tienes obesidad de tipo II.");
        } else if (IMC <= 49.9) {
            System.out.println("Tienes obesidad de tipo III (mórbida).");
        } else {
            System.out.println("Tienes obesidad de tipo IV (extrema).");
        }

        entrada.close();
    }
}