package segundoParcialFila1.ejercicio5State;

public class Client {
    public static void main(String[] args) {
        Celular celu = new Celular();

        celu.setState(new Apagado());
        celu.accionar();
        celu.setState(new Prendiendo());
        celu.accionar();
        celu.setState(new Reiniciado());
        celu.accionar();
        celu.setState(new Prendiendo());
        celu.accionar();
    }
}
