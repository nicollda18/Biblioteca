
package biblioteca;

public class Libreria extends Biblioteca{
    private int textosVendidos;
    private boolean dinamismo;
    private String nombreDelLugar;

    public Libreria(int textosVendidos, boolean dinamismo, String nombreDelLugar, int numeroDeLibros, int numeroDeEstantes, boolean compraDeLibro, String nombreDelLibro, String genero) {
        super(numeroDeLibros, numeroDeEstantes, compraDeLibro, nombreDelLibro, genero);
        this.textosVendidos = textosVendidos;
        this.dinamismo = dinamismo;
        this.nombreDelLugar = nombreDelLugar;
    }
    
    public void ganancias(){
        textosVendidos += 5;
    }
    
    public void ganancias(boolean alto){
        this.textosVendidos += 5;
        this.dinamismo = alto;
    }
    
    public int getTextosVendidos() {
        return textosVendidos;
    }

    public void setTextosVendidos(int textosVendidos) {
        this.textosVendidos = textosVendidos;
    }

    public boolean isDinamismo() {
        return dinamismo;
    }

    public void setDinamismo(boolean dinamismo) {
        this.dinamismo = dinamismo;
    }

    public String getNombreDelLugar() {
        return nombreDelLugar;
    }

    public void setNombreDelLugar(String nombreDelLugar) {
        this.nombreDelLugar = nombreDelLugar;
    }
    
    
    
    
    
}
