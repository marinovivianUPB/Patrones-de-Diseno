package segundoParcialFila1.ejercicio2Mediator;
import java.util.ArrayList;
import java.util.List;

public class Chat implements IChat{

    private List<Estudiante> estudiantes = new ArrayList<>();
    private List<Docente> docentes = new ArrayList<>();
    private List<Administrativo> administrativos = new ArrayList<>();

    public Chat addPersona(Persona persona){
        if(persona.getTipo().equals("Docente")){
            docentes.add((Docente) persona);
        } else if(persona.getTipo().equals("Estudiante")){
            estudiantes.add((Estudiante) persona);
        } else{
            administrativos.add((Administrativo) persona);
        }
        return this;
    }

    @Override
    public void send(String message, Estudiante estudiante, String indicador) {
        if(indicador.equals("docentes")){
            docentes.stream().forEach(a -> a.messageReceived(message));
        } else if (indicador.equals("administrativos")){
            administrativos.stream().forEach(a -> a.messageReceived(message));
        } else{
            estudiantes.stream().filter(a -> !a.equals(estudiante)).forEach(a -> a.messageReceived(message));
            docentes.stream().forEach(a -> a.messageReceived(message));
            administrativos.stream().forEach(a -> a.messageReceived(message));
        }
       
        
        
    }

    @Override
    public void send(String message, Docente docente) {
        estudiantes.stream().forEach(a -> a.messageReceived(message));
        docentes.stream().filter(a -> !a.equals(docente)).forEach(a -> a.messageReceived(message));
    }

    @Override
    public void send(String message, Administrativo admin) {
        estudiantes.stream().forEach(a -> a.messageReceived(message));
        docentes.stream().forEach(a -> a.messageReceived(message));
        administrativos.stream().filter(a -> !a.equals(admin)).forEach(a -> a.messageReceived(message));
        
    }
    
}
