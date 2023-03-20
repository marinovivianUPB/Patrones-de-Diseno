package decorator.ejercicio;

public class Accesorio implements Component {
    private Component component;

    public Accesorio(Component component) {
        this.component = component;
    }

    

    @Override
    public void show() {
        component.show();
    }



    public Component getComponent() {
        return component;
    }



    public void setComponent(Component component) {
        this.component = component;
    }



    @Override
    public void setVelocidad(double velocidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVelocidad'");
    }



    @Override
    public double getVelocidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVelocidad'");
    }

    
}
