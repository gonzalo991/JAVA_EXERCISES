/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introductorios;

import java.util.Scanner;

/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
 * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados centigrados: ");
        int grados = read.nextInt();

        int farenheit = 32 + (9 * grados / 5);

        System.out.println("farenheit = " + farenheit);
    }

}
