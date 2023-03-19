package composite.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> elementos = new ArrayList<>();

    public Composite(String tipo){
        this.setTipo(tipo);
    }

    @Override
    public void add(Component composite) {
        elementos.add(composite);
        setPrecioTotal(this.getPrecioTotal()+composite.getPrecioTotal());
    }

    @Override
    public Component getElement(int posicion) {
        return posicion<elementos.size() ? elementos.get(posicion) : null;
    }

    @Override
    public void operation() {
        System.out.println(getTipo()+"-------------------------------------------");
        for(Component aux : elementos){
            aux.operation();
        }
        System.out.println("TOTAL: "+getPrecioTotal()+"$ -------------------------------------------");
    }

    @Override
    public void remove(Component composite) {
        elementos.remove(composite);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((elementos == null) ? 0 : elementos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Composite other = (Composite) obj;
        if (elementos == null) {
            if (other.elementos != null)
                return false;
        } else if (!elementos.equals(other.elementos))
            return false;
        return true;
    }

    

    

}
