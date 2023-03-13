package segundoParcialFila1.ejercicio2Mediator;

public class Administrativo extends Persona {
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Administrativo(String nombre, IChat chat, String cargo) {
        super(nombre, chat);
        this.cargo = cargo;
        this.setTipo("Administrativo");
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
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
        Administrativo other = (Administrativo) obj;
        if (cargo == null) {
            if (other.cargo != null)
                return false;
        } else if (!cargo.equals(other.cargo))
            return false;
        return true;
    }

    

    
    

}
