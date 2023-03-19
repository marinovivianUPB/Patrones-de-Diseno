package composite.ejercicio;

public abstract class Component {

    private double precioTotal;
    private String tipo;
    

    public abstract void operation();
    public abstract void add(Component composite);
    public abstract void remove(Component composite);
    public abstract Component getElement(int posicion);

    public double getPrecioTotal() {
        return precioTotal;
    }
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(precioTotal);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Component other = (Component) obj;
        if (Double.doubleToLongBits(precioTotal) != Double.doubleToLongBits(other.precioTotal))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        return true;
    }

    

}
