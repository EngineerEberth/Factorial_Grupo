package factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        String input = scanner.next();

        if (!esNumeroValido(input)) {
            System.out.println("Error: Ingrese un número válido (sin letras ni caracteres especiales).");
            return;
        }

        int n = Integer.parseInt(input);

        if (!esMayorAZero(n) && n != 0) {
            System.out.println("Error: El número debe ser mayor o igual a 0.");
            return;
        }

        if (!esEntero(n)) {
            System.out.println("Error: Ingrese un número entero válido.");
            return;
        }

        if (n > 25) {
            System.out.println("El número es grande, usando BigInteger para calcular el factorial.");
            System.out.println("El factorial de " + n + " es: " + factorialGrande(n));
        } else {
            System.out.println("El factorial de " + n + " es: " + factorialRecursivo(n));
        }
    }

    public static long factorialRecursivo(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorialRecursivo(n - 1);
    }

    public static BigInteger factorialGrande(int n) {
        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }

    public static boolean esNumeroValido(String input) {
        return input.matches("\\d+");
    }

    public static boolean esMayorAZero(int n) {
        return n > 0;
    }

    public static boolean esEntero(double num) {
        return (int) num == num;
    }
}
