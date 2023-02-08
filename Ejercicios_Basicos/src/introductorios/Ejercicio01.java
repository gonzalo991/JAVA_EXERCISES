/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introductorios;

import java.util.Scanner;

/**
 * Escribir un programa que pida dos números enteros por teclado y calcule la
 * suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite un número: ");
        int numero = read.nextInt();
        System.out.println("Digite el segundo número: ");
        int numero2 = read.nextInt();

        int suma = numero + numero2;

        System.out.println("suma = " + suma);
    }
}
