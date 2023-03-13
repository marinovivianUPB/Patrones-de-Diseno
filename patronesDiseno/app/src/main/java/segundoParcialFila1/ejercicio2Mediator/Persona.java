package segundoParcialFila1.ejercicio2Mediator;

public abstract class Persona {
    private String nombre; 
    private String tipo;
    private IChat chat;

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        result = prime * result + ((chat == null) ? 0 : chat.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (chat == null) {
            if (other.chat != null)
                return false;
        } else if (!chat.equals(other.chat))
            return false;
        return true;
    }
    public Persona(String nombre, IChat chat) {
        this.nombre = nombre;
        this.chat = chat;
    }
    public abstract void send(String msg, String indicador);
    public abstract void messageReceived(String msg);
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public IChat getChat() {
        return chat;
    }
    public void setChat(IChat chat) {
        this.chat = chat;
    }

    public void show(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: "+tipo);
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
