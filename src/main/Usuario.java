
import java.util.ArrayList;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String password;
    private ArrayList<Evento> eventosInscritos;

    public Usuario(int id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.eventosInscritos = new ArrayList<>();
    }

    public void inscribirEvento(Evento evento) {
        if (!eventosInscritos.contains(evento)) {
            eventosInscritos.add(evento);
        }
        else {
            System.out.println("Ya estás inscrito en este evento.");
        }
    }

    public void cancelarInscripcion(Evento evento) {
        if (eventosInscritos.contains(evento)) {
            eventosInscritos.remove(evento);
        }
        else {
            System.out.println("No puedes cancelar la inscripción porque no estás inscrito en este evento.");
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Evento> getEventosInscritos() {
        return eventosInscritos;
    }

    public void setEventosInscritos(ArrayList<Evento> eventosInscritos) {
        this.eventosInscritos = eventosInscritos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", eventosInscritos=" + eventosInscritos +
                '}';
    }
}