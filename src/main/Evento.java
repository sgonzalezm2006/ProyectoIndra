
import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private int id;
    private String nombre;
    private Date fecha;
    private String descripcion;
    private Ubicacion ubicacion;
    private Organizador organizador;
    private Categoria categoria;
    private ArrayList<Usuario> participantes;
    private boolean cancelado;

    public Evento(int id, String nombre, Date fecha, String descripcion, 
                Ubicacion ubicacion, Organizador organizador, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.organizador = organizador;
        this.categoria = categoria;
        this.participantes = new ArrayList<>();
        this.cancelado = false;
    }

    public void agregarParticipante(Usuario usuario) {
        if (!participantes.contains(usuario)) {
            participantes.add(usuario);
        }
    }

    public void eliminarParticipante(Usuario usuario) {
        participantes.remove(usuario);
    }

    public void cancelarEvento() {
        this.cancelado = true;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Usuario> participantes) {
        this.participantes = participantes;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", ubicacion=" + ubicacion +
                ", organizador=" + organizador +
                ", categoria=" + categoria +
                ", participantes=" + participantes +
                ", cancelado=" + cancelado +
                '}';
    }
}
