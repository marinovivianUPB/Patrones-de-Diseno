package segundoParcialFila1.ejercicio4Strategy;

import java.util.Comparator;
import java.util.List;

public class StrategyByCategoria  implements IStrategy{
    
    @Override
    public List<Libro> ordenar(List<Libro> libros) {
        Comparator<Libro> porCategoria = (Libro a, Libro b) -> a.getCategoria().compareTo(b.getCategoria());
        libros.sort(porCategoria);
        return libros;
    }
}
