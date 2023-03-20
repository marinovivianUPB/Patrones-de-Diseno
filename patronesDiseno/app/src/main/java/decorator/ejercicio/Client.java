package decorator.ejercicio;

public class Client {
    public static void main(String[] args) {
        Component t = new Taxi(80);
        Component m = new Minibus(80);
        Component v = new Vagoneta(120);

        t = new TanqueGas(t, 2);
        v = new Turbo(v);
        v = new GPS(v, "Plaza Bolivar");
        m = new Turbo(m);
        m = new GPS(m, "Terminal");
        m = new TanqueGas(m, 4);

        t.show();
        v.show();
        m.show();
    }
}
