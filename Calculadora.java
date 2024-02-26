/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornos4.pkg1;

/**
 *
 * @author Emilio
 */

public class Calculadora {
    // Método para sumar dos números
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de la calculadora
        Calculadora miCalculadora = new Calculadora();

        // Definir dos números para sumar
        int numero1 = 5;
        int numero2 = 3;

        // Llamar al método sumar y mostrar el resultado
        int resultado = miCalculadora.sumar(numero1, numero2);
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
}

