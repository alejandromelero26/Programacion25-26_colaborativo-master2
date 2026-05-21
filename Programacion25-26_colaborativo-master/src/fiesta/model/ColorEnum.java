package fiesta.model;

public enum ColorEnum {
    VERDE("busca"),
    NARANJA("abierto"),
    ROJO("ocupado");

    private final String estado;

    ColorEnum(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return name().toLowerCase() + " (" + estado + ")";
    }
}
