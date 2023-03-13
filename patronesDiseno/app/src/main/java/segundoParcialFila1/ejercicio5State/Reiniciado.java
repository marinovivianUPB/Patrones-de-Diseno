package segundoParcialFila1.ejercicio5State;

public class Reiniciado implements IState {

    @Override
    public void handler(Celular celu) {
        System.out.println("COMPU REINICIANDO");
        celu.show();
        celu.setCpu(0);
        celu.setRam(0);
        celu.cerrarProgramas();
        celu.show();
        
    }
    
}
