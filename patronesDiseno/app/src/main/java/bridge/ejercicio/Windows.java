package bridge.ejercicio;

public class Windows implements Plataforma{
    private String tipo = "Windows";
    private String version;
    private Arquitectura arquitectura;

    public Windows(String version, Arquitectura arquitectura) {
        this.version = version;
        setArquitectura(arquitectura);
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public void setArquitectura(Arquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void show() {
        System.out.println("--------------------------");
        System.out.println(tipo+version+arquitectura.getTipo());
    }

    
}
