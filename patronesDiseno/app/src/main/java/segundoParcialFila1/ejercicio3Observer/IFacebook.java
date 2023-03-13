package segundoParcialFila1.ejercicio3Observer;

public interface IFacebook {
    void suscribir(IUser user);
    void suscribir(IUser user, String video);
    void notificar(String post);
}
