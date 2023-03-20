package decorator.ejercicio;

public class TanqueGas extends Accesorio {
    private double capacidad;

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public TanqueGas(Component component, double capacidad) {
        super(component);
        this.capacidad = capacidad;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("TANQUE DE GAS: "+capacidad+" litros");
    }

    
}
