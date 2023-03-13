package segundoParcialFila1.ejericio1Memento;

import java.util.ArrayList;
import java.util.List;

public class Backups {
    private List<Memento> versiones = new ArrayList<>();
    private int version=0;
 
    
    public Backups addNuevaVersion(Memento memento){
        if(versiones.size()>version){
            versiones.set(version, memento);
            int aux = version;
            while(versiones.size()>version){
                versiones.remove(aux++);
            }
        } else{
            versiones.add(memento);
        }
        version++;
        return this;
    }

    

    public int getVersion() {
        return version;
    }
    

    public void show(){
        versiones.stream().forEach(a -> a.getArchivo().show());
    }

    public Memento getVersionAnterior(){
       
        if(version-2<0){
            version = 1;
            return versiones.get(0);
        } else{
            version = version -1;
            return versiones.get(version-1);
        }
        
    }

    public Memento getVersionSiguiente(){
        if(version+1>=versiones.size()){
            version = versiones.size();
            return versiones.get(version-1);
        } else{
            version = version +1;
            return versiones.get(version-1);
        }
        
    }
}
