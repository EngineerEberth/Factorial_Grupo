/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ebert
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int n = scanner.nextInt();

        long resultado = factorialRecursivo(n);
        System.out.println("El factorial de " + n + " es: " + resultado);

    }

    // n es la variable global

    //recursivo para calcular el factorial
    public static long factorialRecursivo(int n) {

        return (n == 0 || n == 1) ? 1 : n * factorialRecursivo(n - 1);
    }

    // si un numero es mayor a 0 y no negativos
    public static boolean esMayorAZero(int n) {
        return n > 0;
    }

    //verificar si un número es entero (no fracciones ni decimales)
    public static boolean esEntero(double num) {
        try {
                return (int) num == num;
            } catch (Exception e) {
                return false;
            }
    }

    // calcular factorial de números grandes utilizando BigInteger (usa esto)
    public static java.math.BigInteger factorialGrande(int n) {
          BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }

    // verificar si es válido (no letras ni caracteres)
    public static boolean esNumeroValido(String input) {
        return input.matches("\\d+");
    }

}
