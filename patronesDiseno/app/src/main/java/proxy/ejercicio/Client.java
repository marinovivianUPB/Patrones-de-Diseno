package proxy.ejercicio;

import ejemploSingleton.main;

public class Client {
    public static void main(String[] args) {
        TarjetaDebito t = new TarjetaDebito(new Cuenta("isad12"), "12345","Juan");
        t.accesoCuenta(120, "BS");
        t.accesoCuenta(700, "US");
        t.accesoCuenta(3,"E");
    }
}
