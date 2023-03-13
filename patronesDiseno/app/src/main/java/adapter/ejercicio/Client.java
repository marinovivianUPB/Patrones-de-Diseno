package adapter.ejercicio;

public class Client {
    public static void main(String[] args) {
        IAplicacion2 a = new AppWeb();
        a.iniciarSesion();
        a.cerrarSesion();
        a.generacionDeDatos();

        AplicacionAdapter adapter = new AplicacionAdapter(new AppAndroid());
        adapter.iniciarSesion();
        adapter.cerrarSesion();
        adapter.generacionDeDatos();
    }
}
