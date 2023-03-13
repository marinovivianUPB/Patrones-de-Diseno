package segundoParcialFila1.ejercicio2Mediator;

public class Client {
    public static void main(String[] args) {
        Chat c = new Chat();

        Estudiante a = new Estudiante("a", c, "1");
        Estudiante b = new Estudiante("b", c, "2");
        Estudiante c1 = new Estudiante("c", c, "3");

        Docente d = new Docente("d", c, "62124");
        Docente e = new Docente("e", c, "621243");
        Docente f = new Docente("e", c, "621243");

        Administrativo g = new Administrativo("g", c, "director");
        Administrativo h = new Administrativo("h", c, "director primaria");
        Administrativo i = new Administrativo("i", c, "director prepa");

        c.addPersona(a).addPersona(b).addPersona(c1)
        .addPersona(d).addPersona(e).addPersona(f)
        .addPersona(g).addPersona(h).addPersona(i);

        a.send("HOLA", "docentes");
        a.send("BUENAS", "administrativos");
        a.send("HOLA BUENAS NOCHES", "x");

        d.send("EXMANE", "x");

        g.send("DIA LIBRE", "x");
    }
}
