/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gonxa
 *
 * Considera que estás desarrollando una web para una empresa que fabrica
 * motores (suponemos que se trata del tipo de motor de una bomba para mover
 * fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un
 * valor entre 1 y 4. El programa debe mostrar lo siguiente:
 *
 * o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
 * bomba de agua”.
 *
 * o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
 * bomba de gasolina”.
 *
 * o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
 * bomba de hormigón”.
 *
 * o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
 * bomba de pasta alimenticia”.
 *
 * o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
 * existe un valor válido para tipo de bomba
 *
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite el tipo de motor: ");
        int tipoMotor = read.nextInt();

        if (tipoMotor == 1) {
            System.out.println("La bomba es una bomba de agua.");
        } else if (tipoMotor == 2) {
            System.out.println("La bomba es una bomba de gasolina.");
        } else if (tipoMotor == 3) {
            System.out.println("La bomba es una bomba de hormigon.");
        } else if (tipoMotor == 4) {
            System.out.println("La bomba es una bomba de pasta alimenticia.");
        } else {
            System.out.println("No existe un valor valido para este tipo de bomba.");
        }
    }
}
