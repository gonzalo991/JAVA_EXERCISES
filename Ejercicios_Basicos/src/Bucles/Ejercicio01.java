/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre
 * 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int nota = 0;

        while (nota >= 10 || nota <= 0) {
            System.out.println("Digite la nota: ");
            nota = read.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Incorrecto, vuelva a ingresar su nota: ");
            } else {
                System.out.println("Correcto, su nota es: " + nota);
            }
        }
    }
}
