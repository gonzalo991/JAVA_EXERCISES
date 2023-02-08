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
 * Realizar un programa que solo permita introducir solo frases o palabras de 8
 * de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá
 * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
 * se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en
 * Java.
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Introduzca una frase de 8 caracteres: ");
        String resultado = frase.length() < 8 ? "CORRECTO." : "INCORRECTO.";
        JOptionPane.showMessageDialog(null, resultado);
    }
}
