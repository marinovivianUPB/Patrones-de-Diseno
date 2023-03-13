package segundoParcialFila1.ejercicio4Strategy;

public class Client {
    public static void main(String[] args) {
        BaseDatos b = new BaseDatos();
        b.addLibro(new Libro("a", "f", "c"))
        .addLibro(new Libro("b", "c", "d"));

        b.setStrategy(new StrategyById());
        b.ordenar();
        b.setStrategy(new StrategyByTitulo());
        b.ordenar();
        b.setStrategy(new StrategyByCategoria());
        b.ordenar();
    }
}
