package composite.ejercicio;

public class Client {
    public static void main(String[] args) {
        Computadora a = new Computadora();
        Computadora b = new Computadora();
        Computadora a1 = new Computadora();
        Computadora b1 = new Computadora();

        Composite c = new Composite("laboratorio");
        Composite d = new Composite("laboratorio");

        c.add( a);
        c.add( b);

        d.add(a1);
        d.add(b1);

        Composite e = new Composite("contenedor");

        e.add(c);
        e.add(d);

        e.operation();
    }
}
