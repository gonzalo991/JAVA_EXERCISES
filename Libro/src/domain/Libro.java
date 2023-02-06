
/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. 

Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.

 */
package domain;

public class Libro {

    private String ISBN;
    private String title;
    private String author;
    private int pages;

    public Libro() {
    }

    public Libro(String ISBN, String title, String author, int pages) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    @Override
    public String toString(){
        return "Libro: \n"
                + "{"+ "ISBN: "+ISBN+"\n"
                + "Title: "+title+"\n"
                + "Author: "+author+"\n"
                + "Pages: "+pages+" }";
    }
}
