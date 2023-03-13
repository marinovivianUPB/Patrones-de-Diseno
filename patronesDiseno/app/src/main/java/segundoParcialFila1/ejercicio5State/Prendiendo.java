package segundoParcialFila1.ejercicio5State;

import java.util.List;
import java.util.Random;

public class Prendiendo implements IState {

    @Override
    public void handler(Celular celu) {
        System.out.println("COMPU PRENDIENDO");
        int rand = new Random().nextInt(5) +1;
        int num = rand;
        for(String i: List.of("candy crush", "plantas vs zombies", "tetris", "adobe pdf")){
            if(rand>0){
                celu.addPrograma(i);
                rand--;
            }
        }
        celu.setCpu(num*5);
        celu.setRam(num*5);
        celu.show();
        
    }
    
}