package segundoParcialFila1.ejercicio2Mediator;

public class Estudiante extends Persona{

    private String numeroMatricula;
    

    public Estudiante(String nombre, IChat chat, String numeroMatricula) {
        super(nombre, chat);
        this.setTipo("Estudiante");
        this.numeroMatricula = numeroMatricula;
    }

    

    @Override
    public void messageReceived(String msg) {
        System.out.println("---------------------------------------");
        this.show();
        System.out.println("MENSAJE RECIBIDO:" );
        System.out.println(msg);
        
    }

    @Override
    public void send(String msg, String indicador) {
        System.out.println("-------------------------ENVIANDO MENSAJE----------------------------");
        this.show();
        this.getChat().send(msg, this, indicador);
    }

    




    public String getNumeroMatricula() {
        return numeroMatricula;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((numeroMatricula == null) ? 0 : numeroMatricula.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estudiante other = (Estudiante) obj;
        if (numeroMatricula == null) {
            if (other.numeroMatricula != null)
                return false;
        } else if (!numeroMatricula.equals(other.numeroMatricula))
            return false;
        return true;
    }



    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

}
