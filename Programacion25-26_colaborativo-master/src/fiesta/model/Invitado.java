package fiesta.model;

public class Invitado {
    private int id;
    private String nombre;
    private ColorEnum color;

    public Invitado(int id, String nombre, ColorEnum color) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
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

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", color=" + color +
                '}';
    }
}
