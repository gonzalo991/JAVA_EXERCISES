/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introductorios;

import java.util.Scanner;

/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
 * después toda en minúsculas. Nota: investigar la función toUpperCase() y
 * toLowerCase() en Java.
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Escribe una frase: ");
        String frase = read.nextLine();
        
        System.out.println("frase en mayusculas = " + frase.toUpperCase());
        
        System.out.println("frase en minusculas = " + frase.toLowerCase());
    }
}
