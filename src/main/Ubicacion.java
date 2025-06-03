public class Ubicacion {
    private int id;
    private  String tipo;
    private boolean online;

    public Ubicacion(int id, String tipo,boolean online) {
        this.id = id;
        this.tipo = tipo;
        this.online = online;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", online=" + online +
                '}';
    }
}