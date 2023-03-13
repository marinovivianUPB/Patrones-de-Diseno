package segundoParcialFila1.ejercicio4Strategy;

import java.util.Comparator;
import java.util.List;

public class StrategyById  implements IStrategy{
    
    @Override
    public List<Libro> ordenar(List<Libro> libros) {
        Comparator<Libro> porId = (Libro a, Libro b) -> a.getId().compareTo(b.getId());
        libros.sort(porId);
        return libros;
    }
}
