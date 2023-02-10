/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int acumulator = 0, limit = 0, num = 0;

        System.out.println("Digite un limite para la suma: ");
        limit = read.nextInt();

        while (acumulator != limit) {
            System.out.println("Digite un numero para la suma: ");
            num = read.nextInt();
            acumulator += num;
        }
        
        System.out.println("La suma de los numeros, llego al limite.");
    }
}
