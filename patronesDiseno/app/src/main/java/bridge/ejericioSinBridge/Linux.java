package bridge.ejericioSinBridge;

public abstract class Linux implements Plataforma{

    private String arquitectura;
    private String tipo="Linux";
    private String version="";

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public void setX128() {
        this.arquitectura="X128";
    }

    @Override
    public void setX64() {
        this.arquitectura="X64";
        
    }

    @Override
    public void setX86() {
        this.arquitectura="X86";
        
    }

    @Override
    public void show() {
        System.out.println("-------------------------------------------------------");
        System.out.println(tipo+version+arquitectura);
    }
    
}
