
import java.util.Date;

public class Inscripcion {
    private int id;
    private Usuario usuario;
    private Evento evento;
    private Date fechaInscripcion;
    private boolean activa;

    public Inscripcion(int id, Usuario usuario, Evento evento) {
        this.id = id;
        this.usuario = usuario;
        this.evento = evento;
        this.fechaInscripcion = new Date();
        this.activa = true;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", evento=" + evento +
                ", fechaInscripcion=" + fechaInscripcion +
                ", activa=" + activa +
                '}';
    }

}