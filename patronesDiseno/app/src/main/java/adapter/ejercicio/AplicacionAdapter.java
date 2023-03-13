package adapter.ejercicio;

public class AplicacionAdapter implements IAplicacion2{

    private IAplicacion app;

    

    public AplicacionAdapter(IAplicacion app) {
        this.app = app;
    }



    @Override
    public void cerrarSesion() {
        app.logout();
        
    }



    @Override
    public void generacionDeDatos() {
        app.reportes();
    }



    @Override
    public void iniciarSesion() {
        app.login();
    }

    
    
}
