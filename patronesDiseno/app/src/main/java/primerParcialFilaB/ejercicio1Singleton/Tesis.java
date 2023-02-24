package primerParcialFilaB.ejercicio1Singleton;

public class Tesis {
    private String titulo;
    private String mencion;
    private String nombreEstudiante;
    private String ciEstudiante;

    

    public Tesis(String titulo, String mencion, String nombreEstudiante, String ciEstudiante) {
        this.titulo = titulo;
        this.mencion = mencion;
        this.nombreEstudiante = nombreEstudiante;
        this.ciEstudiante = ciEstudiante;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getMencion() {
        return mencion;
    }
    public void setMencion(String mencion) {
        this.mencion = mencion;
    }
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    public String getCiEstudiante() {
        return ciEstudiante;
    }
    public void setCiEstudiante(String ciEstudiante) {
        this.ciEstudiante = ciEstudiante;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((mencion == null) ? 0 : mencion.hashCode());
        result = prime * result + ((nombreEstudiante == null) ? 0 : nombreEstudiante.hashCode());
        result = prime * result + ((ciEstudiante == null) ? 0 : ciEstudiante.hashCode());
        return result;
    }
    
    public void show(){
        System.out.println("--------------------------------TESIS------------------------------");
        System.out.println("ESTUDIANTE: "+nombreEstudiante+" CI: "+ciEstudiante);
        System.out.println("TITULO: "+titulo);
        System.out.println("MENCION: "+mencion);
    }
    
}
