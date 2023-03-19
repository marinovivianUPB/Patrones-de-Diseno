package composite.ejercicio;

public class Computadora extends Component {

    public Computadora(){
        setTipo("computadora");
        setPrecioTotal(100);
    }

    @Override
    public void add(Component composite) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Component getElement(int posicion) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void operation() {
        System.out.println(getTipo()+"--------------------------------");
        System.out.println("PRECIO: "+this.getPrecioTotal()+"$");
    }

    @Override
    public void remove(Component composite) {
        // TODO Auto-generated method stub
        
    }
    
}
