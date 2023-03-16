package bridge.ejericioSinBridge;

import ejemploSingleton.main;

public class Client {
    public static void main(String[] args) {
        Linux a = new Linux64();
        a.show();

        a= new Linux128();
        a.show();

        a= new Linux86();
        a.show();

        Windows b = new Windowsx64();
        b.show();

        b = new Windowsx128();
        b.show();

        b = new Windowsx86();
        b.show();

        Mac c = new Macx64();
        c.show();

        c = new Macx128();
        c.show();

        c = new Macx86();
        c.show();
    }
}
