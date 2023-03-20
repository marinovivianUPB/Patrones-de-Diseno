package decorator.ejercicio;

public class Minibus implements Component{

    private double velocidad;

    

    public Minibus(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public double getVelocidad() {
        return velocidad;
    }


    @Override
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void show() {
        System.out.println("MINIBUS --------------------------------------");
        System.out.println("VELOCIDAD: "+velocidad+"mph");
    }
    
}

