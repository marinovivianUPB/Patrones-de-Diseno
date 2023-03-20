package decorator.ejercicio;

public class Taxi implements Component{

    private double velocidad;

    

    public Taxi(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }



    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void show() {
        System.out.println("TAXI --------------------------------------");
        System.out.println("VELOCIDAD: "+velocidad+"mph");
    }
    
}

