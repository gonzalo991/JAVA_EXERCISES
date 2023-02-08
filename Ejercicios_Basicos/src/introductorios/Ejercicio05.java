/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introductorios;

import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero por teclado y muestre por
 * pantalla el doble, el triple y la raíz cuadrada de ese número. Nota:
 * investigar la función Math.sqrt().
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite un nùmero: ");
        double numero = read.nextDouble();

        double doble = numero * 2;
        System.out.println("doble = " + doble);

        double triple = numero * 3;
        System.out.println("triple = " + triple);

        double raiz = Math.sqrt(numero);
        System.out.println("raiz = " + raiz);
    }
}
