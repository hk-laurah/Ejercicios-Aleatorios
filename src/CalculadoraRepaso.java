import java.util.Random;
import java.util.Scanner;

public class CalculadoraRepaso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random generador = new Random();
        boolean seguirJugando = true;

        System.out.println("¡Bienvenido a la Calculadora Avanzada!");

        while (seguirJugando) {
            // Generar dos números aleatorios entre 1 y 100
            int numero1 = generador.nextInt(100) + 1;
            int numero2 = generador.nextInt(100) + 1;

            System.out.println("\nNúmeros generados: " + numero1 + " y " + numero2);
            System.out.println("Seleccione la operación:");
            System.out.println("1. Suma (+)");
            System.out.println("2. Resta (-)");
            System.out.println("3. Multiplicación (*)");
            System.out.println("4. División (/)");
            System.out.println("5. Potencia (^)");
            System.out.println("6. Módulo (%)");
            System.out.print("Opción: ");
            int opcion = entrada.nextInt();

            double resultado = realizarOperacion(opcion, numero1, numero2);

            if (resultado != Double.MIN_VALUE) {
                System.out.println("El resultado es: " + resultado);
            }

            // Preguntar si desea continuar
            System.out.print("\n¿Desea realizar otra operación? (1: Sí, 2: No): ");
            int continuar = entrada.nextInt();
            if (continuar != 1) {
                seguirJugando = false;
            }
        }

        System.out.println("calculadora!");
        entrada.close();
    }
    public static double realizarOperacion(int opcion, int num1, int num2) {
        switch (opcion) {
            case 1:
                return sumar(num1, num2);
            case 2:
                return restar(num1, num2);
            case 3:
                return multiplicar(num1, num2);
            case 4:
                return dividir(num1, num2);
            case 5:
                return potencia(num1, num2);
            case 6:
                return modulo(num1, num2);
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                return Double.MIN_VALUE;        }
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.MIN_VALUE;
        }
        return (double) a / b;
    }

    public static double potencia(int base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static int modulo(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede calcular el módulo con divisor cero.");
            return Integer.MIN_VALUE;
        }
        return a % b;
    }
}