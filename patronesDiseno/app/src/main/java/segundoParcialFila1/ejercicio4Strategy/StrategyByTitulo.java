package segundoParcialFila1.ejercicio4Strategy;

import java.util.Comparator;
import java.util.List;

public class StrategyByTitulo implements IStrategy{
    @Override
    public List<Libro> ordenar(List<Libro> libros) {
        Comparator<Libro> porTitulo = (Libro a, Libro b) -> a.getTitulo().compareTo(b.getTitulo());
        libros.sort(porTitulo);
        return libros;
    }
}

