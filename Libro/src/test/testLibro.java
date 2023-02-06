package test;

import domain.Libro;
import java.util.Scanner;

public class testLibro {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("----- Ingrese los datos del Libro que desea cargar: -----");

        System.out.println("ISBN: ");
        String isbn = reader.nextLine();

        System.out.println("Title: ");
        String title = reader.nextLine();

        System.out.println("Author: ");
        String author = reader.nextLine();

        System.out.println("Number of Pages: ");
        int pages = reader.nextInt();

        Libro libro = crearLibro(isbn, title, author, pages);
        
        System.out.println(libro.toString());

    }
    
    public static Libro crearLibro(String ISBN, String title, String author, int pages){
        return new Libro(ISBN, title, author, pages);
    }

}
