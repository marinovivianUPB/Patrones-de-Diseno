package segundoParcialFila1.ejercicio3Observer;

public class Client {
    public static void main(String[] args) {
        Facebook p = new Facebook();

        p.suscribir(new User("pablo"), "video");
        p.suscribir(new User("milenca"), "video");
        p.suscribir(new User("jaime"));
        p.suscribir(new User("sol"));

        p.notificar("video");
        p.notificar("video");
        p.notificar("imagen");
    }
}
