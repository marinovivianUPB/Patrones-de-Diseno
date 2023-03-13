package segundoParcialFila1.ejericio1Memento;

public class Editor {
    private Archivo archivo;

    public void setMemento(Archivo archivo){
        System.out.println("DOCUMENTO LISTO PARA SER GUARDADO");
        this.archivo = archivo;
    }

    public Memento createMemento(){
        Archivo aux = new Archivo();
        aux.setOraciones(archivo.getOraciones());
        aux.setTitulo(archivo.getTitulo());
        return new Memento(aux);
    }

    public Archivo recuperarVersion(Memento memento){
        archivo = memento.getArchivo();
        return archivo;
    }


}
