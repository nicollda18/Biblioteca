
package biblioteca;


public class Digital extends Biblioteca{
    private int numeroDeEjemplares;
    private boolean diversidadTextual;
    private boolean accesibilidad;

    public Digital(int numeroDeEjemplares, boolean diversidadTextual, boolean accesibilidad, int numeroDeLibros, int numeroDeEstantes, boolean compraDeLibro, String nombreDelLibro, String genero) {
        super(numeroDeLibros, numeroDeEstantes, compraDeLibro, nombreDelLibro, genero);
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.diversidadTextual = diversidadTextual;
        this.accesibilidad = accesibilidad;
    }
    
    public void trabajoInvestigacion(int cantidad){
        this.diversidadTextual = true;
        this.numeroDeEjemplares += cantidad;
    }
    
    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public boolean isDiversidadTextual() {
        return diversidadTextual;
    }

    public void setDiversidadTextual(boolean diversidadTextual) {
        this.diversidadTextual = diversidadTextual;
    }

    public boolean isAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(boolean accesibilidad) {
        this.accesibilidad = accesibilidad;
    }
    
}
