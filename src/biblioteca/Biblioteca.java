
package biblioteca;


public class Biblioteca {

private int numeroDeLibros;
private int numeroDeEstantes;
private boolean compraDeLibro;

    public void nuevosClientes(){
        compraDeLibro = true;
    }
    
    public void compraDeEstantes(){
        numeroDeEstantes += 6;
    }
    
    public void alquilerDeLibros(){
        numeroDeLibros -= 12;
    }
    
    public void alquilerDelibros(int nuevoNumeroDeLibros){
        if(nuevoNumeroDeLibros<=numeroDeLibros){
            System.out.println("Usted prestó 12 libros");
        }else{this.numeroDeLibros = nuevoNumeroDeLibros;
            System.out.println("Tenemos:" + String.valueOf(nuevoNumeroDeLibros));
        }
    
    }
    public static void main(String[] args) {
        
    }
    
}
