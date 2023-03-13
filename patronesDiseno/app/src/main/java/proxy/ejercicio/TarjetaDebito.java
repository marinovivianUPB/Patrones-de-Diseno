package proxy.ejercicio;

public class TarjetaDebito implements IBanco{

    private Cuenta cuenta;
    private String numeroTarjeta;
    private String nombreCliente;

    

    public TarjetaDebito(Cuenta cuenta, String numeroTarjeta, String nombreCliente) {
        this.cuenta = cuenta;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreCliente = nombreCliente;
    }



    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }



    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }



    public String getNombreCliente() {
        return nombreCliente;
    }



    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }



    @Override
    public void accesoCuenta(double monto, String moneda) {
        System.out.println("---------------------------------------------------------------");
        if(moneda.equals("BS") && cuenta.getSaldo()-monto>=0){
            cuenta.setSaldo(cuenta.getSaldo()-monto);
            System.out.println(nombreCliente+"--------------------------------------------");
            cuenta.accesoCuenta(monto, moneda);
        } else if(moneda.equals("BS") && cuenta.getSaldo()-monto<0){
            System.out.println("NO SE TIENE EL SALDO SUFICIENTE");
        } else if(moneda.equals("US")){
            System.out.println("CONVIRTIENDO MONTO EN DOLARES A BOLIVIANOS...");
            this.accesoCuenta(monto*7, "BS");
        } else if(moneda.equals("E")){
            System.out.println("CONVIRTIENDO MONTO EN EUROS A BOLIVIANOS...");
            this.accesoCuenta(monto*10, "BS");
        }
    }
    
}
