package adapter.ejercicio;

public class AppEscritorio implements IAplicacion2{

    private String tipo = "APLICACION ESCRITORIO";

    @Override
    public void cerrarSesion() {
       System.out.println(tipo+": CERRANDO SESION");
        
    }

    @Override
    public void generacionDeDatos() {
        System.out.println(tipo+": GENERANDO DATOS");
        
    }

    @Override
    public void iniciarSesion() {
        System.out.println(tipo+": INICIANDO SESION");
        
    }
    
}
