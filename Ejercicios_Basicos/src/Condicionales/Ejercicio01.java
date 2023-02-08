/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gonxa
 *
 * Implementar un programa que dado dos números enteros determine cuál es el
 * mayor y lo muestre por pantalla.
 *
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite un numero: ");
        int numero = read.nextInt();

        System.out.println("Digite otro numero: ");
        int numero1 = read.nextInt();
        
        if (numero > numero1) {
            System.out.println("El numero: " + numero + " es mayor que el numero: " + numero1);
        } else {
            System.out.println("El numero: " + numero1 + " es mayor que el numero: " + numero);
        }
    }
}
