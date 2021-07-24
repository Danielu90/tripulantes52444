package model;

public class curse {
    private int codigo;
    private String nombre;
    private char jornada;

    private Formador formador;
    // constructor
    public curse(int pCodigo,String pNombre, char pJornada,int fCodigo,String fNombre) {
        super();
        // this hace referencia a los objetos de esta clase
        this.codigo =pCodigo;
        this.nombre=pNombre;
        this.jornada=pJornada;
        formador= new Formador(fNombre, fCodigo);
    }
    /**getters */
    public int getCodigo() {
        return codigo;
    }
    public char getJornada() {
        return jornada;
    }
    public String getNombre() {
        return nombre;
    }
    public Formador getFormador() {
        return formador;
    }
    
    //*setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
