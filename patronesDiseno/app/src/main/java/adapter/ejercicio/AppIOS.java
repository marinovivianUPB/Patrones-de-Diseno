package adapter.ejercicio;

public class AppIOS implements IAplicacion{
    private String tipo = "APLICACION IOS";

    @Override
    public void login() {
        System.out.println(tipo+": LOG IN");
    }

    @Override
    public void logout() {
        System.out.println(tipo+": LOG OUT");
        
    }


    @Override
    public void reportes() {
        System.out.println(tipo+": CREANDO REPORTES");
    }
    
}