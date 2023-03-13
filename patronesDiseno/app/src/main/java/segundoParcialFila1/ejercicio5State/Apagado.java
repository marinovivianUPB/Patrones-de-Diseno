package segundoParcialFila1.ejercicio5State;

public class Apagado implements IState {

    @Override
    public void handler(Celular celu) {
        System.out.println("COMPU APAGADA");
        celu.setCpu(1);
        celu.setRam(1);
        celu.show();
        
    }
    
}

