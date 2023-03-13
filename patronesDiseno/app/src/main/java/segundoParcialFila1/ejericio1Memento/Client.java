package segundoParcialFila1.ejericio1Memento;

import ejemploSingleton.main;

public class Client {
    public static void main(String[] args) {
        Backups b = new Backups();
        Editor w = new Editor();

        Archivo a = new Archivo();
        a.setTitulo("hola");

        a.addOracion("buenas");
        w.setMemento(a);

        b.addNuevaVersion(w.createMemento());

        a.addOracion("noches");
        w.setMemento(a);

        b.addNuevaVersion(w.createMemento());

        a.addOracion("mi");
        w.setMemento(a);

        b.addNuevaVersion(w.createMemento());

        a.addOracion("amor");
        w.setMemento(a);

        b.addNuevaVersion(w.createMemento());

        a = w.recuperarVersion(b.getVersionAnterior());
        a.show();
        a = w.recuperarVersion(b.getVersionAnterior());
        a.show();
        a = w.recuperarVersion(b.getVersionAnterior());
        a.show();
        a = w.recuperarVersion(b.getVersionAnterior());
        a.show();
        a = w.recuperarVersion(b.getVersionAnterior());
        a.show();

        a = w.recuperarVersion(b.getVersionSiguiente());
        a.show();
        a = w.recuperarVersion(b.getVersionSiguiente());
        a.show();
        a = w.recuperarVersion(b.getVersionSiguiente());
        a.show();
        a = w.recuperarVersion(b.getVersionSiguiente());
        a.show();
        
    }
}
