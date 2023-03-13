package segundoParcialFila1.ejericio1Memento;

public class Memento {
    private Archivo archivo;
    private String nombre;

    public Memento(Archivo archivo) {
        this.archivo = archivo;
    }

    public Archivo getArchivo() {
        Archivo aux = new Archivo();
        aux.setOraciones(archivo.getOraciones());
        aux.setTitulo(archivo.getTitulo());
        return aux;
    }

    public String getNombre() {
        return nombre;
    }

    
    
}
