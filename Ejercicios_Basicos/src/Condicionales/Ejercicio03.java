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
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
 * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
 * Incorrecto. Nota: investigar la función equals() en Java.
 *
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Escriba una frase: ");
        String frase = read.nextLine();

        String eureka = frase.equals("eureka") ? "Correcto." : "Incorrecto";

        System.out.println(eureka);
    }
}
