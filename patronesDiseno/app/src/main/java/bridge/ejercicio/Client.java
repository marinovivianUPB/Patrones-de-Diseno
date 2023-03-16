package bridge.ejercicio;

public class Client {
    public static void main(String[] args) {
        Windows w = new Windows("7", new ArquitecturaX64());
        w.show();

        Mac m = new Mac("", new ArquitecturaX128());
        m.show();

        Linux l = new Linux("", new ArquitecturaX86());
        l.show();
    }
}
