package segundoParcialFila1.ejercicio4Strategy;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    List<Libro> libros = new ArrayList<>();

    private IStrategy strategy;


    public BaseDatos addLibro(Libro e){
        libros.add(e);
        return this;
    }
    
    public void ordenar(){
        System.out.println("ORDENADOS: -------------------------------------------------------");
        this.strategy.ordenar(libros).stream().forEach(a -> a.show());
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
