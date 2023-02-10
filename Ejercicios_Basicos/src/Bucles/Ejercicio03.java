/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú: MENU 1. Sumar 2. Restar 3.
 * Multiplicar 4. Dividir 5. Salir Elija opción: El usuario deberá elegir una
 * opción y el programa deberá mostrar el resultado por pantalla y luego volver
 * al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener
 * en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
 * programa directamente, se debe mostrar el siguiente mensaje de confirmación:
 * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int menu = 0, salir = 0;

        do {
            menu();
            menu = read.nextInt();
            operaciones(menu);
            if (menu == 5) {
                System.out.println("Estas seguro que deseas salir?\n"
                        + "1.- Si \n"
                        + "2.- No");
                salir = read.nextInt();
            }
        } while (salir != 1);

    }

    public static void operaciones(int menu) {
        Scanner read = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        switch (menu) {
            case 1:
                System.out.println("Digite un numero para la suma: ");
                num1 = read.nextInt();
                System.out.println("Digite el segundo numero: ");
                num2 = read.nextInt();
                num1 += num2;
                System.out.println("El resultado de la suma es: " + num1);
                break;
            case 2:
                System.out.println("Digite un numero para la resta: ");
                num1 = read.nextInt();
                System.out.println("Digite el segundo numero: ");
                num2 = read.nextInt();
                num1 -= num2;
                System.out.println("El resultado de la resta es: " + num1);
                break;
            case 3:
                System.out.println("Digite un numero para la multiplicacion : ");
                num1 = read.nextInt();
                System.out.println("Digite el segundo numero: ");
                num2 = read.nextInt();
                num1 *= num2;
                System.out.println("El resultado de la multiplicacion es: " + num1);
                break;
            case 4:
                System.out.println("Digite un numero para la division: ");
                num1 = read.nextInt();
                System.out.println("Digite el segundo numero: ");
                num2 = read.nextInt();
                num1 /= num2;
                System.out.println("El resultado de la division es: " + num1);
                break;
        }
    }

    public static void menu() {
        System.out.println("--------Menu--------\n"
                + "1.-Sumar\n"
                + "2.-Restar\n"
                + "3.-Multiplicar\n"
                + "4.-Dividir\n"
                + "5.-Salir\n"
                + "Elija una opcion: ");
    }

}
