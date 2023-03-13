package segundoParcialFila1.ejercicio2Mediator;

public class Docente extends Persona {
    private String ci;


    
    public Docente(String nombre, IChat chat, String ci) {
        super(nombre, chat);
        this.ci = ci;
        this.setTipo("Docente");
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((ci == null) ? 0 : ci.hashCode());
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
        Docente other = (Docente) obj;
        if (ci == null) {
            if (other.ci != null)
                return false;
        } else if (!ci.equals(other.ci))
            return false;
        return true;
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
       this.getChat().send(msg, this);
    }
    
}
