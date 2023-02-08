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
 * Crear un programa que dado un numero determine si es par o impar
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite un numero: ");
        int numero = read.nextInt();

        String esPar = numero % 2 == 0 ? "El numero es par." : "El numero es impar.";

        System.out.println(esPar);
    }

}
