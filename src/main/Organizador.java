
import java.util.ArrayList;
import java.util.Date;


public class Organizador {
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private String empresa;
    private ArrayList<Evento> eventosOrganizados;

    public Organizador(int id, String nombre, String email, String telefono, String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.empresa = empresa;
        this.eventosOrganizados = new ArrayList<>();
    }
    public void crearEvento(int id,String nombre, Date fecha, 
                            String descripcion, Ubicacion ubicacion, Categoria categoria) {
        eventosOrganizados.add(new Evento(id, nombre, fecha, descripcion, ubicacion, this, categoria));
    }

    public void desactivarEvento(Evento evento) {
        if (eventosOrganizados.contains(evento)) {
            evento.setCancelado(true);
        }
    }

    public void reactivarEvento(Evento evento) {
        if (eventosOrganizados.contains(evento)) {
            evento.setCancelado(false);
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Evento> getEventosOrganizados() {
        return eventosOrganizados;
    }

    public void setEventosOrganizados(ArrayList<Evento> eventosOrganizados) {
        this.eventosOrganizados = eventosOrganizados;
    }

    @Override
    public String toString() {
        return "Organizador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", empresa='" + empresa + '\'' +
                ", eventosOrganizados=" + eventosOrganizados +
                '}';
    }

}