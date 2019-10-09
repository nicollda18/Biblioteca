
package biblioteca;


public class Biblioteca {

private int numeroDeLibros;
private int numeroDeEstantes;
private boolean compraDeLibro;
private String nombreDelLibro;
private String genero;

    public Biblioteca(int numeroDeLibros, int numeroDeEstantes, boolean compraDeLibro, String nombreDelLibro, String genero) {
        this.numeroDeLibros = numeroDeLibros;
        this.numeroDeEstantes = numeroDeEstantes;
        this.compraDeLibro = compraDeLibro;
        this.nombreDelLibro = nombreDelLibro;
        this.genero = genero;
    }
    
    public void nuevosClientes(){
        compraDeLibro = true;
    }
    
    public void compraDeEstantes(){
        numeroDeEstantes += 6;
    }
    
    public void alquilerDeLibros(){
        numeroDeLibros -= 12;
    }
    
    public void busqueda(String nomGenero, String nomLibro){
        this.nombreDelLibro = nomLibro + " del genero " + nomGenero;
    }
    
    
    public void alquilerDelibros(int nuevoNumeroDeLibros){
        if(nuevoNumeroDeLibros<=numeroDeLibros){
            System.out.println("Usted prestó 12 libros");
        }else{this.numeroDeLibros = nuevoNumeroDeLibros;
            System.out.println("Tenemos:" + String.valueOf(nuevoNumeroDeLibros)+ " Libros ");
        }
    
    }
}
