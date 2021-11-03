
package poo.ejercicio02;

import java.util.Scanner;
/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor que inicialice esos 
atributos con los valores pasados como parámetros. Definir una instancia para 
cargar un libro y luego informar mediante otro método el número de ISBN, 
el título y el autor del libro.
 */
public class POOEjercicio02 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int ISBN, numeroPaginas, ejemplares, prestados;
        String titulo, autor;
        
        
        //se cre el objeto libro1 utilizando el constructor con parametros
        Libro l1 = new Libro( 1225, "El quijote", "Cervantes", 300, 2, 0 );
        Libro l2 = new Libro( 3256, "Como evitar un desastre climatico", "bill gates", 658, 3, 1 );
        Libro l3 = new Libro( 6985, "De sangre y cenizas", "jennifer armentrout", 896, 4, 2);
        Libro l4 = new Libro();
        
        System.out.print("Introduce ISBN: ");
        ISBN = sc.nextInt();
        System.out.print("Introduce el titulo: ");
        titulo = sc.next();
        System.out.print("Introduce el autor: ");
        autor = sc.next();
        System.out.print("Numero de paginas: ");
        numeroPaginas = sc.nextInt();
        System.out.print("Numero de Ejemplares: ");
        ejemplares = sc.nextInt();
        
        l4.setISBN(ISBN);
        l4.setTitulo(titulo);
        l4.setAutor(autor);
        l4.setNumeroPaginas(numeroPaginas);
        l4.setEjemplares(ejemplares);
        
        System.out.println(l4);
        
        System.out.println("LIBRO 1");
        System.out.println("ISBN: "+ l1.getISBN());
        System.out.println("Titulo: "+ l1.getTitulo());
        System.out.println("Autor: "+ l1.getAutor());
        System.out.println("Numero Paginas: "+ l1.getNumeroPaginas());
        System.out.println("Numero Ejemplares: "+ l1.getEjemplares());
        System.out.println("Prestados: "+ l1.getPrestados());
        System.out.println();
        
        
        if (l1.prestamo()){
            System.out.println("Se ha prestado el libro " + l1.getTitulo());
        }else{
            System.out.println("No quedan ejemplares del libro " + l1.getTitulo() + " para prestar");
        }
        
        if (l1.devolucion()){
            System.out.println("El libro se ha devuelto " + l1.getTitulo());
        }else{
            System.out.println("No hay ejemplares del libro " + l1.getTitulo() + " prestados");
        }
        
        if (l2.prestamo()){
            System.out.println("Se ha prestado el libro " + l2.getTitulo());
        }else{
            System.out.println("No quedan ejemplares del libro " + l2.getTitulo() + " para prestar");
        }
        
        System.out.println("Libro 3:");
        System.out.println("ISBN: " + l3.getISBN());
        System.out.println("Titulo: " + l3.getTitulo());
        System.out.println("Autor: " + l3.getAutor());
        System.out.println("Ejemplares: " + l3.getEjemplares());
        System.out.println("Prestados: " + l3.getPrestados());
        
        
        
        
        
        
      
    }
    
}
