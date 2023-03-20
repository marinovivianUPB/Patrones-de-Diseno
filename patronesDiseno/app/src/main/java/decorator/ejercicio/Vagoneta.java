package decorator.ejercicio;

public class Vagoneta implements Component{

    private double velocidad;

    

    public Vagoneta(double velocidad) {
        this.velocidad = velocidad;
    }



    @Override
    public void show() {
        System.out.println("Vagoneta --------------------------------------");
        System.out.println("VELOCIDAD: "+velocidad+"mph");
    }



    public double getVelocidad() {
        return velocidad;
    }



    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
}
