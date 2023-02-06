package test;

import domain.Circunferencia;
import java.util.Scanner;

public class testCircunferencia {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        final double pi = 3.14;
        
        Circunferencia circulo = new Circunferencia();
        
        System.out.println("Digite el radio del circulo");
        double radio = read.nextDouble();
        crearCircunferencia(radio, circulo);
        
        double area = area(circulo,pi);
        System.out.println("area = " + area);
        
        double perimetro = perimetro(circulo, pi);
        System.out.println("perimetro = " + perimetro);
   
    }

    public static void crearCircunferencia(double radio, Circunferencia circunferencia) {
        circunferencia.setRadio(radio);
    }

    public static double area(Circunferencia circunferencia, double pi) {
        return pi * Math.pow(circunferencia.getRadio(), 2);
    }

    public static double perimetro(Circunferencia circunferencia, double pi) {
        return 2 * pi * circunferencia.getRadio();
    }
}
