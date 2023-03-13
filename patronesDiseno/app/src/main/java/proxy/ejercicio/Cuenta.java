package proxy.ejercicio;

public class Cuenta implements IBanco{
    private String id;
    private double saldo;
    

    public Cuenta(String id) {
        this.id = id;
        saldo = 1000;
    }



    @Override
    public void accesoCuenta(double monto, String moneda) {
        System.out.println("SE ACCEDIO A LA CUENTA DE BANCO: "+id);
        System.out.println("SE SACO EL MONTO DE: "+monto+" BS");
        System.out.println("SALDO ACTUAL: "+saldo);
    }



    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public double getSaldo() {
        return saldo;
    }



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
