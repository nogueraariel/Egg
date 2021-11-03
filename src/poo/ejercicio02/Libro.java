
package poo.ejercicio02;


public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int ejemplares;
    private int prestados;
    private int devueltos;
    private int perdidos;
    
    public Libro(){
        
    }
    
    public Libro(int ISBN, String titulo, String autor, int numeroPaginas, int ejemplares, int prestados){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    public boolean prestamo(){
        boolean prestado = true;
        if(prestados < ejemplares){
            prestados++;
        }else{
            prestado = false;
        }
        
        return prestado;
    }
    
    public boolean devolucion(){
        boolean devuelto = true;
        if(prestados == 0){
            devuelto = false;
        }else{
            prestados--;
        }
        return devuelto;
    }
    
    

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=  " + titulo + ", autor=  " +
                autor + ", numeroPaginas=  " + numeroPaginas + ", ejemplares=  " +
                ejemplares + ", prestados=  " + prestados + '}';
    }
    
    
    
    
    
    
}
