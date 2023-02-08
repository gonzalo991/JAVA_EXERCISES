/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author gonxa
 *
 * Escriba un programa que pida una frase o palabra y valide si la primera letra
 * de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
 * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se
 * deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y
 * equals() de Java.
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite una frase o palabra: ");

        String primeraLetra = frase.substring(0, 1).equals("A") ? "CORRECTO" : "INCORRECTO";

        JOptionPane.showMessageDialog(null, primeraLetra);
    }
}
